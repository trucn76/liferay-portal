/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBMessage service. Represents a row in the &quot;MBMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBMessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MBMessage
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageImpl
 * @see com.liferay.portlet.messageboards.model.impl.MBMessageModelImpl
 * @generated
 */
public interface MBMessageModel extends BaseModel<MBMessage>, GroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message-boards message model instance should use the {@link MBMessage} interface instead.
	 */

	/**
	 * Gets the primary key of this message-boards message.
	 *
	 * @return the primary key of this message-boards message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message-boards message
	 *
	 * @param primaryKey the primary key of this message-boards message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the uuid of this message-boards message.
	 *
	 * @return the uuid of this message-boards message
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this message-boards message.
	 *
	 * @param uuid the uuid of this message-boards message
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the message ID of this message-boards message.
	 *
	 * @return the message ID of this message-boards message
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this message-boards message.
	 *
	 * @param messageId the message ID of this message-boards message
	 */
	public void setMessageId(long messageId);

	/**
	 * Gets the group ID of this message-boards message.
	 *
	 * @return the group ID of this message-boards message
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this message-boards message.
	 *
	 * @param groupId the group ID of this message-boards message
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this message-boards message.
	 *
	 * @return the company ID of this message-boards message
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this message-boards message.
	 *
	 * @param companyId the company ID of this message-boards message
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this message-boards message.
	 *
	 * @return the user ID of this message-boards message
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this message-boards message.
	 *
	 * @param userId the user ID of this message-boards message
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this message-boards message.
	 *
	 * @return the user uuid of this message-boards message
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this message-boards message.
	 *
	 * @param userUuid the user uuid of this message-boards message
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this message-boards message.
	 *
	 * @return the user name of this message-boards message
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this message-boards message.
	 *
	 * @param userName the user name of this message-boards message
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this message-boards message.
	 *
	 * @return the create date of this message-boards message
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this message-boards message.
	 *
	 * @param createDate the create date of this message-boards message
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this message-boards message.
	 *
	 * @return the modified date of this message-boards message
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message-boards message.
	 *
	 * @param modifiedDate the modified date of this message-boards message
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the class name of the model instance this message-boards message is polymorphically associated with.
	 *
	 * @return the class name of the model instance this message-boards message is polymorphically associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name ID of this message-boards message.
	 *
	 * @return the class name ID of this message-boards message
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this message-boards message.
	 *
	 * @param classNameId the class name ID of this message-boards message
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this message-boards message.
	 *
	 * @return the class p k of this message-boards message
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this message-boards message.
	 *
	 * @param classPK the class p k of this message-boards message
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the category ID of this message-boards message.
	 *
	 * @return the category ID of this message-boards message
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this message-boards message.
	 *
	 * @param categoryId the category ID of this message-boards message
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Gets the thread ID of this message-boards message.
	 *
	 * @return the thread ID of this message-boards message
	 */
	public long getThreadId();

	/**
	 * Sets the thread ID of this message-boards message.
	 *
	 * @param threadId the thread ID of this message-boards message
	 */
	public void setThreadId(long threadId);

	/**
	 * Gets the root message ID of this message-boards message.
	 *
	 * @return the root message ID of this message-boards message
	 */
	public long getRootMessageId();

	/**
	 * Sets the root message ID of this message-boards message.
	 *
	 * @param rootMessageId the root message ID of this message-boards message
	 */
	public void setRootMessageId(long rootMessageId);

	/**
	 * Gets the parent message ID of this message-boards message.
	 *
	 * @return the parent message ID of this message-boards message
	 */
	public long getParentMessageId();

	/**
	 * Sets the parent message ID of this message-boards message.
	 *
	 * @param parentMessageId the parent message ID of this message-boards message
	 */
	public void setParentMessageId(long parentMessageId);

	/**
	 * Gets the subject of this message-boards message.
	 *
	 * @return the subject of this message-boards message
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this message-boards message.
	 *
	 * @param subject the subject of this message-boards message
	 */
	public void setSubject(String subject);

	/**
	 * Gets the body of this message-boards message.
	 *
	 * @return the body of this message-boards message
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this message-boards message.
	 *
	 * @param body the body of this message-boards message
	 */
	public void setBody(String body);

	/**
	 * Gets the format of this message-boards message.
	 *
	 * @return the format of this message-boards message
	 */
	@AutoEscape
	public String getFormat();

	/**
	 * Sets the format of this message-boards message.
	 *
	 * @param format the format of this message-boards message
	 */
	public void setFormat(String format);

	/**
	 * Gets the attachments of this message-boards message.
	 *
	 * @return the attachments of this message-boards message
	 */
	public boolean getAttachments();

	/**
	 * Determines if this message-boards message is attachments.
	 *
	 * @return <code>true</code> if this message-boards message is attachments; <code>false</code> otherwise
	 */
	public boolean isAttachments();

	/**
	 * Sets whether this message-boards message is attachments.
	 *
	 * @param attachments the attachments of this message-boards message
	 */
	public void setAttachments(boolean attachments);

	/**
	 * Gets the anonymous of this message-boards message.
	 *
	 * @return the anonymous of this message-boards message
	 */
	public boolean getAnonymous();

	/**
	 * Determines if this message-boards message is anonymous.
	 *
	 * @return <code>true</code> if this message-boards message is anonymous; <code>false</code> otherwise
	 */
	public boolean isAnonymous();

	/**
	 * Sets whether this message-boards message is anonymous.
	 *
	 * @param anonymous the anonymous of this message-boards message
	 */
	public void setAnonymous(boolean anonymous);

	/**
	 * Gets the priority of this message-boards message.
	 *
	 * @return the priority of this message-boards message
	 */
	public double getPriority();

	/**
	 * Sets the priority of this message-boards message.
	 *
	 * @param priority the priority of this message-boards message
	 */
	public void setPriority(double priority);

	/**
	 * Gets the allow pingbacks of this message-boards message.
	 *
	 * @return the allow pingbacks of this message-boards message
	 */
	public boolean getAllowPingbacks();

	/**
	 * Determines if this message-boards message is allow pingbacks.
	 *
	 * @return <code>true</code> if this message-boards message is allow pingbacks; <code>false</code> otherwise
	 */
	public boolean isAllowPingbacks();

	/**
	 * Sets whether this message-boards message is allow pingbacks.
	 *
	 * @param allowPingbacks the allow pingbacks of this message-boards message
	 */
	public void setAllowPingbacks(boolean allowPingbacks);

	/**
	 * Gets the status of this message-boards message.
	 *
	 * @return the status of this message-boards message
	 */
	public int getStatus();

	/**
	 * Sets the status of this message-boards message.
	 *
	 * @param status the status of this message-boards message
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user ID of this message-boards message.
	 *
	 * @return the status by user ID of this message-boards message
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this message-boards message.
	 *
	 * @param statusByUserId the status by user ID of this message-boards message
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this message-boards message.
	 *
	 * @return the status by user uuid of this message-boards message
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this message-boards message.
	 *
	 * @param statusByUserUuid the status by user uuid of this message-boards message
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this message-boards message.
	 *
	 * @return the status by user name of this message-boards message
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this message-boards message.
	 *
	 * @param statusByUserName the status by user name of this message-boards message
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this message-boards message.
	 *
	 * @return the status date of this message-boards message
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this message-boards message.
	 *
	 * @param statusDate the status date of this message-boards message
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated {@link #isApproved}
	 */
	public boolean getApproved();

	/**
	 * Determines if this message-boards message is approved.
	 *
	 * @return <code>true</code> if this message-boards message is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines if this message-boards message is a draft.
	 *
	 * @return <code>true</code> if this message-boards message is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines if this message-boards message is expired.
	 *
	 * @return <code>true</code> if this message-boards message is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines if this message-boards message is pending.
	 *
	 * @return <code>true</code> if this message-boards message is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(MBMessage mbMessage);

	public int hashCode();

	public MBMessage toEscapedModel();

	public String toString();

	public String toXmlString();
}