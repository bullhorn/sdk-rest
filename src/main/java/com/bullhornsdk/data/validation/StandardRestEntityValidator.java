package com.bullhornsdk.data.validation;

import java.util.HashMap;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;

/**
 * Validates both using a custom Validator implementation for an entity, and running the jsr 303 validations based on annotation on the
 * entity.
 * 
 * @author magnus.palm
 * 
 */

public class StandardRestEntityValidator implements RestEntityValidator {

	private final LocalValidatorFactoryBean validator;

	private final Map<Class<? extends CreateEntity>, Validator> validatorMap;

	public StandardRestEntityValidator(LocalValidatorFactoryBean validator, RestAppointmentValidator restAppointmentValidator,
			RestAppointmentAttendeeValidator restAppointmentAttendeeValidator, RestCandidateValidator restCandidateValidator,
			RestCandidateEducationValidator restCandidateEducationValidator,
			RestCandidateReferenceValidator restCandidateReferenceValidator,
			RestCandidateWorkHistoryValidator restCandidateWorkHistoryValidator, RestCertificationValidator restCertificationValidator,
			RestClientContactValidator restClientContactValidator, RestClientCorporationValidator restClientCorporationValidator,
            RestJobOrderValidator restJobOrderValidator, RestJobSubmissionValidator restJobSubmissionValidator,
			RestLeadValidator restLeadValidator, RestNoteValidator restNoteValidator, RestNoteEntityValidator restNoteEntityValidator,
			RestOpportunityValidator restOpportunityValidator, RestPlacementValidator restPlacementValidator,
            RestPlacementCommissionValidator restPlacementCommissionValidator, RestSendoutValidator restSendoutValidator,
            RestTaskValidator restTaskValidator) {
		super();
		this.validator = validator;
		this.validatorMap = new HashMap<Class<? extends CreateEntity>, Validator>();
		this.validatorMap.put(Appointment.class, restAppointmentValidator);
		this.validatorMap.put(AppointmentAttendee.class, restAppointmentAttendeeValidator);
		this.validatorMap.put(Candidate.class, restCandidateValidator);
		this.validatorMap.put(CandidateEducation.class, restCandidateEducationValidator);
		this.validatorMap.put(CandidateReference.class, restCandidateReferenceValidator);
		this.validatorMap.put(CandidateWorkHistory.class, restCandidateWorkHistoryValidator);
		this.validatorMap.put(Certification.class, restCertificationValidator);
		this.validatorMap.put(ClientContact.class, restClientContactValidator);
		this.validatorMap.put(ClientCorporation.class, restClientCorporationValidator);
		this.validatorMap.put(JobOrder.class, restJobOrderValidator);
		this.validatorMap.put(JobSubmission.class, restJobSubmissionValidator);
        this.validatorMap.put(Lead.class, restLeadValidator);
		this.validatorMap.put(Note.class, restNoteValidator);
		this.validatorMap.put(NoteEntity.class, restNoteEntityValidator);
        this.validatorMap.put(Opportunity.class, restOpportunityValidator);
		this.validatorMap.put(Placement.class, restPlacementValidator);
		this.validatorMap.put(PlacementCommission.class, restPlacementCommissionValidator);
		this.validatorMap.put(Sendout.class, restSendoutValidator);
		this.validatorMap.put(Task.class, restTaskValidator);

	}

	public StandardRestEntityValidator(LocalValidatorFactoryBean validator, Map<Class<? extends CreateEntity>, Validator> validatorMap) {
		super();
		this.validator = validator;
		this.validatorMap = validatorMap;
	}

	public static RestEntityValidator getDefaultInstance() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		HashMap<Class<? extends CreateEntity>, Validator> validatorMap = new HashMap<Class<? extends CreateEntity>, Validator>();
		validatorMap.put(Appointment.class, new RestAppointmentValidator());
		validatorMap.put(AppointmentAttendee.class, new RestAppointmentAttendeeValidator());
		validatorMap.put(Candidate.class, new RestCandidateValidator());
		validatorMap.put(CandidateEducation.class, new RestCandidateEducationValidator());
		validatorMap.put(CandidateReference.class, new RestCandidateReferenceValidator());
		validatorMap.put(CandidateWorkHistory.class, new RestCandidateWorkHistoryValidator());
		validatorMap.put(Certification.class, new RestCertificationValidator());
		validatorMap.put(ClientContact.class, new RestClientContactValidator());
		validatorMap.put(ClientCorporation.class, new RestClientCorporationValidator());
		validatorMap.put(JobOrder.class, new RestJobOrderValidator());
		validatorMap.put(JobSubmission.class, new RestJobSubmissionValidator());
        validatorMap.put(Lead.class, new RestLeadValidator());
		validatorMap.put(HousingComplex.class, new RestHousingComplexValidator());
		validatorMap.put(Note.class, new RestNoteValidator());
		validatorMap.put(NoteEntity.class, new RestNoteEntityValidator());
        validatorMap.put(Opportunity.class, new RestOpportunityValidator());
		validatorMap.put(Placement.class, new RestPlacementValidator());
		validatorMap.put(PlacementCommission.class, new RestPlacementCommissionValidator());
		validatorMap.put(Sendout.class, new RestSendoutValidator());
		validatorMap.put(Task.class, new RestTaskValidator());
		return new StandardRestEntityValidator(validator, validatorMap);
	}

	@Override
	public <T extends CreateEntity> Errors validateEntityOnInsert(T entity) {
		Errors errors = this.getErrorsObject(entity);

		Validator validator = validatorMap.get(entity.getClass());
		if (validator == null) {
			throw new IllegalArgumentException("No Validator exists for entity of type " + entity.getClass().getSimpleName());
		}
		validator.validate(entity, errors);

		runJsr303Validations(entity, errors);

		return errors;

	}

	@Override
	public <T extends UpdateEntity> Errors validateEntityOnUpdate(T entity) {
		Errors errors = this.getErrorsObject(entity);

		runJsr303Validations(entity, errors);

		return errors;
	}

	private void runJsr303Validations(Object obj, Errors e) {
		validator.validate(obj, e);
	}

	private <T extends BullhornEntity> Errors getErrorsObject(T entity) {
		return new BeanPropertyBindingResult(entity, entity.getClass().getSimpleName());
	}

}
