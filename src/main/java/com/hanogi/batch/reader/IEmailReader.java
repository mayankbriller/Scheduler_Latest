package com.hanogi.batch.reader;

import java.util.Map;

import com.hanogi.batch.constants.ExecutionStatusEnum;
import com.hanogi.batch.dto.Email;
import com.hanogi.batch.dto.batch.BatchRunDetails;

import net.sf.ehcache.Cache;

public interface IEmailReader {
	

	/**
	 * Method to read mails from the mail server
	 * @param emailProcessingStatusMap 
	 * @param employeeList
	 * @return 
	 * @throws Exception
	 */
	public void  readMail(Email email,BatchRunDetails batchRunDetails, Map<String, ExecutionStatusEnum> emailProcessingStatusMap,Cache cache ) throws Exception;

}
