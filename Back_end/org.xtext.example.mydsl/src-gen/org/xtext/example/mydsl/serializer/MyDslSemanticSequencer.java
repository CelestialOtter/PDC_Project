/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import ecoreModelProject.And;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Or;
import ecoreModelProject.Restaurant;
import ecoreModelProject.Search;
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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcoreModelProjectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcoreModelProjectPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case EcoreModelProjectPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case EcoreModelProjectPackage.RESTAURANT:
				sequence_Restaurant(context, (Restaurant) semanticObject); 
				return; 
			case EcoreModelProjectPackage.SEARCH:
				sequence_Search(context, (Search) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     And returns And
	 *
	 * Constraint:
	 *     (leftSpecification=[Specification|ID] rightSpecification=[Specification|ID])
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION));
			if (transientValues.isValueTransient(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getLeftSpecificationSpecificationIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION, false));
		feeder.accept(grammarAccess.getAndAccess().getRightSpecificationSpecificationIDTerminalRuleCall_3_0_1(), semanticObject.eGet(EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Or returns Or
	 *
	 * Constraint:
	 *     (leftSpecification=[Specification|ID] rightSpecification=[Specification|ID])
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION));
			if (transientValues.isValueTransient(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getLeftSpecificationSpecificationIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EcoreModelProjectPackage.Literals.BINARY_OP__LEFT_SPECIFICATION, false));
		feeder.accept(grammarAccess.getOrAccess().getRightSpecificationSpecificationIDTerminalRuleCall_3_0_1(), semanticObject.eGet(EcoreModelProjectPackage.Literals.BINARY_OP__RIGHT_SPECIFICATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Restaurant
	 *     Restaurant returns Restaurant
	 *
	 * Constraint:
	 *     arguments=STRING
	 */
	protected void sequence_Restaurant(ISerializationContext context, Restaurant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EcoreModelProjectPackage.Literals.SPECIFICATION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcoreModelProjectPackage.Literals.SPECIFICATION__ARGUMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRestaurantAccess().getArgumentsSTRINGTerminalRuleCall_2_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Search returns Search
	 *
	 * Constraint:
	 *     specifications+=Specification
	 */
	protected void sequence_Search(ISerializationContext context, Search semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}