/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rcs.service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rcs.service.model.MessageSource;
import com.rcs.service.model.MessageSourceModel;
import com.rcs.service.service.persistence.MessageSourcePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the MessageSource service. Represents a row in the &quot;editor_MessageSource&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rcs.service.model.MessageSourceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MessageSourceImpl}.
 * </p>
 *
 * @author flor
 * @see MessageSourceImpl
 * @see com.rcs.service.model.MessageSource
 * @see com.rcs.service.model.MessageSourceModel
 * @generated
 */
public class MessageSourceModelImpl extends BaseModelImpl<MessageSource>
	implements MessageSourceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a message source model instance should use the {@link com.rcs.service.model.MessageSource} interface instead.
	 */
	public static final String TABLE_NAME = "editor_MessageSource";
	public static final Object[][] TABLE_COLUMNS = {
			{ "key_", Types.VARCHAR },
			{ "locale", Types.VARCHAR },
			{ "value", Types.CLOB },
			{ "bundle", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table editor_MessageSource (key_ VARCHAR(255) not null,locale VARCHAR(20) not null,value TEXT null,bundle VARCHAR(75) null,primary key (key_, locale))";
	public static final String TABLE_SQL_DROP = "drop table editor_MessageSource";
	public static final String ORDER_BY_JPQL = " ORDER BY messageSource.id.key ASC";
	public static final String ORDER_BY_SQL = " ORDER BY editor_MessageSource.key_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rcs.service.model.MessageSource"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rcs.service.model.MessageSource"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rcs.service.model.MessageSource"),
			true);
	public static long BUNDLE_COLUMN_BITMASK = 1L;
	public static long KEY_COLUMN_BITMASK = 2L;
	public static long LOCALE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rcs.service.model.MessageSource"));

	public MessageSourceModelImpl() {
	}

	public MessageSourcePK getPrimaryKey() {
		return new MessageSourcePK(_key, _locale);
	}

	public void setPrimaryKey(MessageSourcePK primaryKey) {
		setKey(primaryKey.key);
		setLocale(primaryKey.locale);
	}

	public Serializable getPrimaryKeyObj() {
		return new MessageSourcePK(_key, _locale);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((MessageSourcePK)primaryKeyObj);
	}

	public Class<?> getModelClass() {
		return MessageSource.class;
	}

	public String getModelClassName() {
		return MessageSource.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("key", getKey());
		attributes.put("locale", getLocale());
		attributes.put("value", getValue());
		attributes.put("bundle", getBundle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String locale = (String)attributes.get("locale");

		if (locale != null) {
			setLocale(locale);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String bundle = (String)attributes.get("bundle");

		if (bundle != null) {
			setBundle(bundle);
		}
	}

	public String getKey() {
		if (_key == null) {
			return StringPool.BLANK;
		}
		else {
			return _key;
		}
	}

	public void setKey(String key) {
		_columnBitmask = -1L;

		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	public String getLocale() {
		if (_locale == null) {
			return StringPool.BLANK;
		}
		else {
			return _locale;
		}
	}

	public void setLocale(String locale) {
		_columnBitmask |= LOCALE_COLUMN_BITMASK;

		if (_originalLocale == null) {
			_originalLocale = _locale;
		}

		_locale = locale;
	}

	public String getOriginalLocale() {
		return GetterUtil.getString(_originalLocale);
	}

	public String getValue() {
		if (_value == null) {
			return StringPool.BLANK;
		}
		else {
			return _value;
		}
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getBundle() {
		if (_bundle == null) {
			return StringPool.BLANK;
		}
		else {
			return _bundle;
		}
	}

	public void setBundle(String bundle) {
		_columnBitmask |= BUNDLE_COLUMN_BITMASK;

		if (_originalBundle == null) {
			_originalBundle = _bundle;
		}

		_bundle = bundle;
	}

	public String getOriginalBundle() {
		return GetterUtil.getString(_originalBundle);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public MessageSource toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MessageSource)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	public MessageSource toUnescapedModel() {
		return (MessageSource)this;
	}

	@Override
	public Object clone() {
		MessageSourceImpl messageSourceImpl = new MessageSourceImpl();

		messageSourceImpl.setKey(getKey());
		messageSourceImpl.setLocale(getLocale());
		messageSourceImpl.setValue(getValue());
		messageSourceImpl.setBundle(getBundle());

		messageSourceImpl.resetOriginalValues();

		return messageSourceImpl;
	}

	public int compareTo(MessageSource messageSource) {
		int value = 0;

		value = getKey().compareTo(messageSource.getKey());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MessageSource)) {
			return false;
		}

		MessageSource messageSource = (MessageSource)obj;

		MessageSourcePK primaryKey = messageSource.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		MessageSourceModelImpl messageSourceModelImpl = this;

		messageSourceModelImpl._originalKey = messageSourceModelImpl._key;

		messageSourceModelImpl._originalLocale = messageSourceModelImpl._locale;

		messageSourceModelImpl._originalBundle = messageSourceModelImpl._bundle;

		messageSourceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MessageSource> toCacheModel() {
		MessageSourceCacheModel messageSourceCacheModel = new MessageSourceCacheModel();

		messageSourceCacheModel.key = getKey();

		String key = messageSourceCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			messageSourceCacheModel.key = null;
		}

		messageSourceCacheModel.locale = getLocale();

		String locale = messageSourceCacheModel.locale;

		if ((locale != null) && (locale.length() == 0)) {
			messageSourceCacheModel.locale = null;
		}

		messageSourceCacheModel.value = getValue();

		String value = messageSourceCacheModel.value;

		if ((value != null) && (value.length() == 0)) {
			messageSourceCacheModel.value = null;
		}

		messageSourceCacheModel.bundle = getBundle();

		String bundle = messageSourceCacheModel.bundle;

		if ((bundle != null) && (bundle.length() == 0)) {
			messageSourceCacheModel.bundle = null;
		}

		return messageSourceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{key=");
		sb.append(getKey());
		sb.append(", locale=");
		sb.append(getLocale());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", bundle=");
		sb.append(getBundle());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rcs.service.model.MessageSource");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locale</column-name><column-value><![CDATA[");
		sb.append(getLocale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bundle</column-name><column-value><![CDATA[");
		sb.append(getBundle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MessageSource.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MessageSource.class
		};
	private String _key;
	private String _originalKey;
	private String _locale;
	private String _originalLocale;
	private String _value;
	private String _bundle;
	private String _originalBundle;
	private long _columnBitmask;
	private MessageSource _escapedModel;
}