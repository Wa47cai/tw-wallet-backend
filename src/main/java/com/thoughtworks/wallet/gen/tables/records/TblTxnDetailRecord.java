/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables.records;


import com.thoughtworks.wallet.gen.tables.TblTxnDetail;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record2;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblTxnDetailRecord extends UpdatableRecordImpl<TblTxnDetailRecord> implements Record13<String, Short, LocalDateTime, Integer, Object, String, String, String, Integer, Integer, Short, Short, String> {

    private static final long serialVersionUID = 1171088782;

    /**
     * Setter for <code>public.tbl_txn_detail.txn_hash</code>.
     */
    public TblTxnDetailRecord setTxnHash(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.txn_hash</code>.
     */
    public String getTxnHash() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.txn_type</code>.
     */
    public TblTxnDetailRecord setTxnType(Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.txn_type</code>.
     */
    public Short getTxnType() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.txn_time</code>.
     */
    public TblTxnDetailRecord setTxnTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.txn_time</code>.
     */
    public LocalDateTime getTxnTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.height</code>.
     */
    public TblTxnDetailRecord setHeight(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(3);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public TblTxnDetailRecord setAmount(Object value) {
        set(4, value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getAmount() {
        return get(4);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.asset_name</code>.
     */
    public TblTxnDetailRecord setAssetName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.asset_name</code>.
     */
    public String getAssetName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.from_address</code>.
     */
    public TblTxnDetailRecord setFromAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.from_address</code>.
     */
    public String getFromAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.to_address</code>.
     */
    public TblTxnDetailRecord setToAddress(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.to_address</code>.
     */
    public String getToAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.block_index</code>.
     */
    public TblTxnDetailRecord setBlockIndex(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.block_index</code>.
     */
    public Integer getBlockIndex() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.txn_index</code>.
     */
    public TblTxnDetailRecord setTxnIndex(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.txn_index</code>.
     */
    public Integer getTxnIndex() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.confirm_flag</code>.
     */
    public TblTxnDetailRecord setConfirmFlag(Short value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.confirm_flag</code>.
     */
    public Short getConfirmFlag() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.event_type</code>.
     */
    public TblTxnDetailRecord setEventType(Short value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.event_type</code>.
     */
    public Short getEventType() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>public.tbl_txn_detail.contract_hash</code>.
     */
    public TblTxnDetailRecord setContractHash(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_txn_detail.contract_hash</code>.
     */
    public String getContractHash() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Short, LocalDateTime, Integer, Object, String, String, String, Integer, Integer, Short, Short, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, Short, LocalDateTime, Integer, Object, String, String, String, Integer, Integer, Short, Short, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TblTxnDetail.TBL_TXN_DETAIL.TXN_HASH;
    }

    @Override
    public Field<Short> field2() {
        return TblTxnDetail.TBL_TXN_DETAIL.TXN_TYPE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return TblTxnDetail.TBL_TXN_DETAIL.TXN_TIME;
    }

    @Override
    public Field<Integer> field4() {
        return TblTxnDetail.TBL_TXN_DETAIL.HEIGHT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return TblTxnDetail.TBL_TXN_DETAIL.AMOUNT;
    }

    @Override
    public Field<String> field6() {
        return TblTxnDetail.TBL_TXN_DETAIL.ASSET_NAME;
    }

    @Override
    public Field<String> field7() {
        return TblTxnDetail.TBL_TXN_DETAIL.FROM_ADDRESS;
    }

    @Override
    public Field<String> field8() {
        return TblTxnDetail.TBL_TXN_DETAIL.TO_ADDRESS;
    }

    @Override
    public Field<Integer> field9() {
        return TblTxnDetail.TBL_TXN_DETAIL.BLOCK_INDEX;
    }

    @Override
    public Field<Integer> field10() {
        return TblTxnDetail.TBL_TXN_DETAIL.TXN_INDEX;
    }

    @Override
    public Field<Short> field11() {
        return TblTxnDetail.TBL_TXN_DETAIL.CONFIRM_FLAG;
    }

    @Override
    public Field<Short> field12() {
        return TblTxnDetail.TBL_TXN_DETAIL.EVENT_TYPE;
    }

    @Override
    public Field<String> field13() {
        return TblTxnDetail.TBL_TXN_DETAIL.CONTRACT_HASH;
    }

    @Override
    public String component1() {
        return getTxnHash();
    }

    @Override
    public Short component2() {
        return getTxnType();
    }

    @Override
    public LocalDateTime component3() {
        return getTxnTime();
    }

    @Override
    public Integer component4() {
        return getHeight();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getAmount();
    }

    @Override
    public String component6() {
        return getAssetName();
    }

    @Override
    public String component7() {
        return getFromAddress();
    }

    @Override
    public String component8() {
        return getToAddress();
    }

    @Override
    public Integer component9() {
        return getBlockIndex();
    }

    @Override
    public Integer component10() {
        return getTxnIndex();
    }

    @Override
    public Short component11() {
        return getConfirmFlag();
    }

    @Override
    public Short component12() {
        return getEventType();
    }

    @Override
    public String component13() {
        return getContractHash();
    }

    @Override
    public String value1() {
        return getTxnHash();
    }

    @Override
    public Short value2() {
        return getTxnType();
    }

    @Override
    public LocalDateTime value3() {
        return getTxnTime();
    }

    @Override
    public Integer value4() {
        return getHeight();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getAmount();
    }

    @Override
    public String value6() {
        return getAssetName();
    }

    @Override
    public String value7() {
        return getFromAddress();
    }

    @Override
    public String value8() {
        return getToAddress();
    }

    @Override
    public Integer value9() {
        return getBlockIndex();
    }

    @Override
    public Integer value10() {
        return getTxnIndex();
    }

    @Override
    public Short value11() {
        return getConfirmFlag();
    }

    @Override
    public Short value12() {
        return getEventType();
    }

    @Override
    public String value13() {
        return getContractHash();
    }

    @Override
    public TblTxnDetailRecord value1(String value) {
        setTxnHash(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value2(Short value) {
        setTxnType(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value3(LocalDateTime value) {
        setTxnTime(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value4(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public TblTxnDetailRecord value5(Object value) {
        setAmount(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value6(String value) {
        setAssetName(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value7(String value) {
        setFromAddress(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value8(String value) {
        setToAddress(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value9(Integer value) {
        setBlockIndex(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value10(Integer value) {
        setTxnIndex(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value11(Short value) {
        setConfirmFlag(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value12(Short value) {
        setEventType(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord value13(String value) {
        setContractHash(value);
        return this;
    }

    @Override
    public TblTxnDetailRecord values(String value1, Short value2, LocalDateTime value3, Integer value4, Object value5, String value6, String value7, String value8, Integer value9, Integer value10, Short value11, Short value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblTxnDetailRecord
     */
    public TblTxnDetailRecord() {
        super(TblTxnDetail.TBL_TXN_DETAIL);
    }

    /**
     * Create a detached, initialised TblTxnDetailRecord
     */
    public TblTxnDetailRecord(String txnHash, Short txnType, LocalDateTime txnTime, Integer height, Object amount, String assetName, String fromAddress, String toAddress, Integer blockIndex, Integer txnIndex, Short confirmFlag, Short eventType, String contractHash) {
        super(TblTxnDetail.TBL_TXN_DETAIL);

        set(0, txnHash);
        set(1, txnType);
        set(2, txnTime);
        set(3, height);
        set(4, amount);
        set(5, assetName);
        set(6, fromAddress);
        set(7, toAddress);
        set(8, blockIndex);
        set(9, txnIndex);
        set(10, confirmFlag);
        set(11, eventType);
        set(12, contractHash);
    }
}
