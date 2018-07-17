/*
 * generated by Xtext 2.13.0
 */
package ac.soton.xtheory.serializer;

import ac.soton.xtheory.services.TheoryGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eventb.emf.core.CorePackage;
import theoryextension.Argument;
import theoryextension.Axiom;
import theoryextension.Case;
import theoryextension.ConditionalRewrite;
import theoryextension.ConditionalRewriteRule;
import theoryextension.Constructor;
import theoryextension.Destructor;
import theoryextension.Given;
import theoryextension.Infer;
import theoryextension.InferenceRule;
import theoryextension.Operator;
import theoryextension.RewriteRule;
import theoryextension.Rule;
import theoryextension.RuleBlock;
import theoryextension.Theorem;
import theoryextension.Theory;
import theoryextension.TheoryextensionPackage;
import theoryextension.Type;
import theoryextension.UnconditionalRewrite;
import theoryextension.Variable;

@SuppressWarnings("all")
public class TheorySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TheoryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TheoryextensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TheoryextensionPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case TheoryextensionPackage.AXIOM:
				sequence_Axiom(context, (Axiom) semanticObject); 
				return; 
			case TheoryextensionPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case TheoryextensionPackage.CONDITIONAL_REWRITE:
				sequence_ConditionalRewrite(context, (ConditionalRewrite) semanticObject); 
				return; 
			case TheoryextensionPackage.CONDITIONAL_REWRITE_RULE:
				sequence_ConditionalRewriteRule(context, (ConditionalRewriteRule) semanticObject); 
				return; 
			case TheoryextensionPackage.CONSTRUCTOR:
				sequence_Constructor(context, (Constructor) semanticObject); 
				return; 
			case TheoryextensionPackage.DESTRUCTOR:
				sequence_Destructor(context, (Destructor) semanticObject); 
				return; 
			case TheoryextensionPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case TheoryextensionPackage.INFER:
				sequence_Infer(context, (Infer) semanticObject); 
				return; 
			case TheoryextensionPackage.INFERENCE_RULE:
				sequence_InferenceRule(context, (InferenceRule) semanticObject); 
				return; 
			case TheoryextensionPackage.OPERATOR:
				sequence_Operator(context, (Operator) semanticObject); 
				return; 
			case TheoryextensionPackage.PARAMETER:
				sequence_Parameter(context, (theoryextension.Parameter) semanticObject); 
				return; 
			case TheoryextensionPackage.REWRITE_RULE:
				sequence_RewriteRule(context, (RewriteRule) semanticObject); 
				return; 
			case TheoryextensionPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case TheoryextensionPackage.RULE_BLOCK:
				sequence_RuleBlock(context, (RuleBlock) semanticObject); 
				return; 
			case TheoryextensionPackage.THEOREM:
				sequence_Theorem(context, (Theorem) semanticObject); 
				return; 
			case TheoryextensionPackage.THEORY:
				sequence_Theory(context, (Theory) semanticObject); 
				return; 
			case TheoryextensionPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case TheoryextensionPackage.UNCONDITIONAL_REWRITE:
				sequence_UnconditionalRewrite(context, (UnconditionalRewrite) semanticObject); 
				return; 
			case TheoryextensionPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID type=STRING)
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Axiom returns Axiom
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID predicate=STRING)
	 */
	protected void sequence_Axiom(ISerializationContext context, Axiom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (pattern=STRING formula=STRING)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TheoryextensionPackage.Literals.CASE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryextensionPackage.Literals.CASE__PATTERN));
			if (transientValues.isValueTransient(semanticObject, TheoryextensionPackage.Literals.CASE__FORMULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryextensionPackage.Literals.CASE__FORMULA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0(), semanticObject.getFormula());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalRewriteRule returns ConditionalRewriteRule
	 *
	 * Constraint:
	 *     (lhs=STRING rhs=STRING)
	 */
	protected void sequence_ConditionalRewriteRule(ISerializationContext context, ConditionalRewriteRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TheoryextensionPackage.Literals.CONDITIONAL_REWRITE_RULE__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryextensionPackage.Literals.CONDITIONAL_REWRITE_RULE__LHS));
			if (transientValues.isValueTransient(semanticObject, TheoryextensionPackage.Literals.CONDITIONAL_REWRITE_RULE__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TheoryextensionPackage.Literals.CONDITIONAL_REWRITE_RULE__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalRewrite returns ConditionalRewrite
	 *
	 * Constraint:
	 *     (rewrites+=ConditionalRewriteRule rewrites+=ConditionalRewriteRule*)
	 */
	protected void sequence_ConditionalRewrite(ISerializationContext context, ConditionalRewrite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constructor returns Constructor
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID (destructors+=Destructor destructors+=Destructor*)?)
	 */
	protected void sequence_Constructor(ISerializationContext context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Destructor returns Destructor
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID type=STRING)
	 */
	protected void sequence_Destructor(ISerializationContext context, Destructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Given returns Given
	 *
	 * Constraint:
	 *     (expression=STRING required?='required'?)
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Infer returns Infer
	 *
	 * Constraint:
	 *     expression=STRING
	 */
	protected void sequence_Infer(ISerializationContext context, Infer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BEXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InferenceRule returns InferenceRule
	 *
	 * Constraint:
	 *     (given+=Given* infer=Infer)
	 */
	protected void sequence_InferenceRule(ISerializationContext context, InferenceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns Operator
	 *
	 * Constraint:
	 *     (
	 *         (comment=ML_COMMENT | comment=SL_COMMENT)? 
	 *         name=ID 
	 *         (arguments+=Argument arguments+=Argument*)? 
	 *         ((type=STRING | notation=Notation)? (associative?='associative' commutative?='commutative'?)?)+ 
	 *         precedent=INT? 
	 *         wd=STRING? 
	 *         (definition=STRING | (case=ID cases+=Case+))?
	 *     )
	 */
	protected void sequence_Operator(ISerializationContext context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Parameter(ISerializationContext context, theoryextension.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RewriteRule returns RewriteRule
	 *
	 * Constraint:
	 *     (pattern=STRING (urule=UnconditionalRewrite | crule=ConditionalRewrite))
	 */
	protected void sequence_RewriteRule(ISerializationContext context, RewriteRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleBlock returns RuleBlock
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID variables+=Variable* rule=Rule)
	 */
	protected void sequence_RuleBlock(ISerializationContext context, RuleBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (rrule=RewriteRule | irule=InferenceRule)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Theorem returns Theorem
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID predicate=STRING)
	 */
	protected void sequence_Theorem(ISerializationContext context, Theorem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Theory returns Theory
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         parameters+=Parameter* 
	 *         (imports+=ID imports+=ID*)? 
	 *         (internalElements+=Type | internalElements+=Operator | internalElements+=Axiom | internalElements+=Theorem | internalElements+=RuleBlock)*
	 *     )
	 */
	protected void sequence_Theory(ISerializationContext context, Theory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID parameters+=[Parameter|ID]* constructors+=Constructor constructors+=Constructor*)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnconditionalRewrite returns UnconditionalRewrite
	 *
	 * Constraint:
	 *     rhs+=STRING
	 */
	protected void sequence_UnconditionalRewrite(ISerializationContext context, UnconditionalRewrite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     ((comment=ML_COMMENT | comment=SL_COMMENT)? name=ID type=STRING)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
