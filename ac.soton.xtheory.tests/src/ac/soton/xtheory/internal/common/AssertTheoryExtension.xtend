package ac.soton.xtheory.internal.common

import theoryextension.Theory
import org.junit.Assert
import theoryextension.TheoryextensionPackage
import org.eventb.emf.core.EventBNamed
import theoryextension.Type
import theoryextension.Parameter
import theoryextension.Operator
import theoryextension.Constructor
import theoryextension.Destructor
import theoryextension.Argument
import theoryextension.Notation
import theoryextension.Case
import theoryextension.Theorem
import theoryextension.Axiom
import theoryextension.RuleBlock
import theoryextension.Variable
import theoryextension.ConditionalRewriteRule
import theoryextension.Given
import org.eventb.emf.core.EventBObject
import theoryextension.Rule

class AssertTheoryExtension {
	/**
	 * Utility method to register the Context EPackage. This is done by simply
	 * access the eClass of the ContextPackage's {@link ContextPackage.eINSTANCE}. 
	 */
	def registerTheoryEPackage() {
		TheoryextensionPackage.eINSTANCE.eClass() // Register the Context EPackage
	}
	
	def assertTheory(Theory thy, String expectedName, String expectedComments) {
		// Assert precondition
		Assert.assertNotNull("Input context must not be null", thy)
		
		Assert.assertEquals("Incorrect context's name", expectedName, thy.name)
	}
	
	def assertTheoryParameters(Theory thy, String... expectedParameters) {
		// Assert precondition
		Assert.assertNotNull("Input theory must not be null", thy)
		
		val actualParameters = thy.parameters
		Assert.assertEquals("Incorrect number of parameters", 
			expectedParameters.length, actualParameters.length
		)
		for (var i = 0; i < expectedParameters.length; i++) {
			Assert.assertEquals("Incorrect parameter name", 
				expectedParameters.get(i), actualParameters.get(i).prettyPrint()
			)
		}
	}
	
	def assertTheoryInternalElements(Theory thy, String... expectedInternalElements) {
		// Assert precondition
		Assert.assertNotNull("Input theory must not be null", thy)
		
		val actualInternalElements = thy.internalElements
		Assert.assertEquals("Incorrect number of internalElements", 
			expectedInternalElements.length, actualInternalElements.length
		)
		for (var i = 0; i < expectedInternalElements.length; i++) {
			Assert.assertEquals("Incorrect internalElement name", 
				expectedInternalElements.get(i), actualInternalElements.get(i).prettyPrint()
			)
		}
	}
	
	def assertTheoryRuleBlocks(Theory thy, String... expectedRuleblocks) {
		// Assert precondition
		Assert.assertNotNull("Input theory must not be null", thy)
		
		val actualruleBlocks = thy.ruleBlocks
		Assert.assertEquals("Incorrect number of internalElements", 
			expectedRuleblocks.length, actualruleBlocks.length
		)
		for (var i = 0; i < expectedRuleblocks.length; i++) {
			Assert.assertEquals("Incorrect internalElement name", 
				expectedRuleblocks.get(i), actualruleBlocks.get(i).prettyPrint()
			)
		}
	}

	def private prettyPrint(EventBNamed lmnt){
		var str = lmnt.name
		if (lmnt instanceof Type){
			if (lmnt.parameters.length != 0){
				str += "( "
				for (Parameter para: lmnt.parameters)
					str += para.prettyPrint() + " "
				str += ")"
			}
			str += " ="
			for (Constructor cons: lmnt.constructors){
				str += " " + cons.name
				if (cons.destructors.length != 0){
					str += "( "
					for (Destructor des: cons.destructors){
						str += des.name + ": " + des.type + " "
					}
					str += ")"
				}
			}
		}
		if (lmnt instanceof Argument){
			str += ": " + lmnt.type
		}
		if (lmnt instanceof Operator){
			if (lmnt.arguments.length != 0){
				str += "( "
				for (Argument arg: lmnt.arguments)
					str += arg.prettyPrint() + " "
				str += ")"
			}
			str += ":" + (lmnt.type ?: "") + ":"
			str += switch lmnt.notation{
				case Notation.PREFIX: "prefix:"
				case Notation.INFIX: "infix:"
				case Notation.POSTFIX: "postfix:"
			}
			if (lmnt.associative) str += "associative:"
			if (lmnt.commutative) str += "commutative:"
			str += (lmnt.precedent.toString() ?: "") + ":" + (lmnt.wd ?: "")
			str += "=" + (lmnt.definition ?: "") + "|" + (lmnt.getCase() ?: "").toString()
			for (Case cas: lmnt.cases)
				str += " " + cas.pattern + " => " + cas.formula
		}
		if (lmnt instanceof Theorem){
			str += ": " + lmnt.predicate
		}
		if (lmnt instanceof Axiom){
			str += ": " + lmnt.predicate
		}
		if (lmnt instanceof Variable){
			str += ": " + lmnt.type
		}
		return str
	}
	
	def private prettyPrint(RuleBlock rb) {
		var str = ""
		for (Variable vari: rb.variables) {
			str += vari.prettyPrint() + " "
		}
		for (Rule rule: rb.rules) {
			str += rule.name + ": "
			if (rule.rrule !== null) {
				str += rule.rrule.pattern + " =="
				if (rule.rrule.urule !== null)
					for (String s: rule.rrule.urule.rhs)
						str += " " + s
				else
					for (ConditionalRewriteRule crr: rule.rrule.crule.rewrites)
						str += " " + crr.lhs + " => " + crr.rhs
			}
			else {
				for (Given giv: rule.irule.given){
					str += giv.expression + " "
						if (giv.required) str += "required "
				}
				str += "|- " + rule.irule.infer.expression
			}
			str += ";"
		}
		
		return str
	}
}