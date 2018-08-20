/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xtheory.tests

import ac.soton.xtheory.internal.common.AssertExtension
import ac.soton.xtheory.internal.common.AssertTheoryExtension
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import theoryextension.Theory

@RunWith(XtextRunner)
@InjectWith(TheoryInjectorProvider)
class TheoryParsingTest {
	@Inject extension ParseHelper<Theory> parseHelper
	
	extension AssertExtension = new AssertExtension()
	extension AssertTheoryExtension = new AssertTheoryExtension()
	
	/**
	 * Manually register any EPackage required for running the tests.
	 */
	@Before
	def void registerEPackages() {
		registerTheoryEPackage
	}
	
	/*@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}*/
	
	@Test
	def void testTheoryClauseSuccessful() {
		val testInput = 
		'''
			theory thy
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		result.assertTheory("thy", null)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements()
	}
	
	@Test
	def void testParameterClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy(T)
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters("T")
		result.assertTheoryInternalElements()
	}
	
	@Test
	def void testParameterClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy(T S)
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters("T", "S")
		result.assertTheoryInternalElements()
	}
	
	@Test
	def void testTypeClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				type List = nil
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("List = nil")
	}
	
	@Test
	def void testTypeClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				type List = nil
				type Real = zero
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("List = nil", "Real = zero")
	}
	
	@Test
	def void testOperatorClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus::prefix:0:=|")
	}
	
	@Test
	def void testOperatorClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				op plus
				op minus
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus::prefix:0:=|", "minus::prefix:0:=|")
	}
	
	@Test
	def void testAxiomClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				axm @axm0: "#x:NAT.x >= 0"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("axm0: #x:NAT.x >= 0")
	}
	
	@Test
	def void testAxiomClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				axm @axm0: "#x:NAT.x >= 0"
				axm @axm1: "#y:NAT.-y <= 0"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("axm0: #x:NAT.x >= 0", "axm1: #y:NAT.-y <= 0")
	}
	
	@Test
	def void testTheoremClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				thm @thm0: "#x:NAT.x >= 0"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("thm0: #x:NAT.x >= 0")
	}
	
	@Test
	def void testTheoremClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				thm @thm0: "#x:NAT.x >= 0"
				thm @thm1: "#y:NAT.-y <= 0"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("thm0: #x:NAT.x >= 0", "thm1: #y:NAT.-y <= 0")
	}
	
	@Test
	def void testRuleBlockClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				ruleblock
					rule @rule0: "TRUE" |- "TRUE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("rule0: TRUE |- TRUE;")
	}
	
	@Test
	def void testRuleBlockClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				ruleblock
					rule @rule0: "TRUE" |- "TRUE"
					rule @rule1: "FALSE" |- "FALSE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("rule0: TRUE |- TRUE;rule1: FALSE |- FALSE;")
	}
	
	@Test
	def void testTypeDestructorClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy(T)
				type List = nil | cons(head: "T", tail: "List(T)")
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters("T")
		result.assertTheoryInternalElements("List = nil cons( head: T tail: List(T) )")
	}
	
	@Test
	def void testOperatorArgumentClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op sqrt(x: "NAT")
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("sqrt( x: NAT )::prefix:0:=|")
	}
	
	@Test
	def void testOperatorArgumentClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y: "NAT")
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::prefix:0:=|")
	}
	
	@Test
	def void testOperatorTypeClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y: "NAT") : "NAT"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT ):NAT:prefix:0:=|")
	}
	
	@Test
	def void testOperatorPrefixClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op sqrt prefix
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("sqrt::prefix:0:=|")
	}
	
	@Test
	def void testOperatorInfixClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y:"NAT") infix
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::infix:0:=|")
	}
	
	@Test
	def void testOperatorPostfixClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op trans(x: "NAT") postfix
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("trans( x: NAT )::postfix:0:=|")
	}
	
	@Test
	def void testOperatorAssociativeClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y:"NAT") associative
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::prefix:associative:0:=|")
	}
	
	@Test
	def void testOperatorCommutativeClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y:"NAT") associative commutative
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::prefix:associative:commutative:0:=|")
	}
	
	@Test
	def void testOperatorWDClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op sqrt(x: "INT") for "x:NAT"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("sqrt( x: INT )::prefix:0:x:NAT=|")
	}
	
	@Test
	def void testOperatorDefinitionClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y:"NAT") = "x+y" 
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::prefix:0:=x+y|")
	}
	
	@Test
	def void testOperatorCaseClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				op plus(x: "NAT", y:"NAT") = case x "INT" => "x+y" 
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("plus( x: NAT y: NAT )::prefix:0:=|x INT => x+y")
	}
	
	@Test
	def void testOperatorCaseClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				op listSize(l: "List(T)") prefix = case l
					"nil" => "0" 
					"cons(x, l0)" => "1+listSize(l0)"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryInternalElements("listSize( l: List(T) )::prefix:0:=|l nil => 0 cons(x, l0) => 1+listSize(l0)")
	}
	
	@Test
	def void testRuleBlockVariableClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				ruleblock
					variables x: "NAT"
				    rule @rule0: "TRUE" |- "TRUE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("x: NAT rule0: TRUE |- TRUE;")
	}
	
	@Test
	def void testRuleBlockVariableClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				ruleblock
					variables x: "NAT" y: "NAT"
					rule @rule0: "TRUE" |- "TRUE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("x: NAT y: NAT rule0: TRUE |- TRUE;")
	}
	
	@Test
	def void testRuleBlockGivenClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				ruleblock
					rule @rule0: "TRUE" "FALSE" |- "FALSE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("rule0: TRUE FALSE |- FALSE;")
	}
	
	@Test
	def void testRuleBlockGivenRequiredClauseSuccessful_1() {
		val testInput = 
		'''
			theory thy
				ruleblock
					rule @rule0: "TRUE" required "FALSE" |- "FALSE"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("rule0: TRUE required FALSE |- FALSE;")
	}
	
	@Test
	def void testRuleBlockUnconditionalClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				ruleblock
					variables i: "INT" j:"INT"
					rule @CardNatRange: "card(i..j)" == "j-i+1"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("i: INT j: INT CardNatRange: card(i..j) == j-i+1;")
	}
	
	@Test
	def void testRuleBlockConditionalClauseSuccessful_2() {
		val testInput = 
		'''
			theory thy
				ruleblock
					variables i: "INT" j:"INT"
					rule @CardIntRange: "card(i..j)" == "i<=j" => "j-i+1"
												   		"i>j" => "0"
			end
		'''
		val result = testInput.parse
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		errors.assertEmpty
		Assert.assertTrue(result instanceof Theory)
		Assert.assertEquals("thy", result.name)
		result.assertTheoryParameters()
		result.assertTheoryRuleBlocks("i: INT j: INT CardIntRange: card(i..j) == i<=j => j-i+1 i>j => 0;")
	}
}
