/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen;


import com.thoughtworks.wallet.gen.tables.FlywaySchemaHistory;
import com.thoughtworks.wallet.gen.tables.TblBlocks;
import com.thoughtworks.wallet.gen.tables.TblDcep;
import com.thoughtworks.wallet.gen.tables.TblHealthyVerificationClaim;
import com.thoughtworks.wallet.gen.tables.TblIdentities;
import com.thoughtworks.wallet.gen.tables.TblIssuers;
import com.thoughtworks.wallet.gen.tables.TblSuspectedPatientsPhoneList;
import com.thoughtworks.wallet.gen.tables.TblTransactions;
import com.thoughtworks.wallet.gen.tables.TblVcTypes;
import com.thoughtworks.wallet.gen.tables.TblVerifiers;
import com.thoughtworks.wallet.gen.tables.records.FlywaySchemaHistoryRecord;
import com.thoughtworks.wallet.gen.tables.records.TblBlocksRecord;
import com.thoughtworks.wallet.gen.tables.records.TblDcepRecord;
import com.thoughtworks.wallet.gen.tables.records.TblHealthyVerificationClaimRecord;
import com.thoughtworks.wallet.gen.tables.records.TblIdentitiesRecord;
import com.thoughtworks.wallet.gen.tables.records.TblIssuersRecord;
import com.thoughtworks.wallet.gen.tables.records.TblSuspectedPatientsPhoneListRecord;
import com.thoughtworks.wallet.gen.tables.records.TblTransactionsRecord;
import com.thoughtworks.wallet.gen.tables.records.TblVcTypesRecord;
import com.thoughtworks.wallet.gen.tables.records.TblVerifiersRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TblIssuersRecord, Integer> IDENTITY_TBL_ISSUERS = Identities0.IDENTITY_TBL_ISSUERS;
    public static final Identity<TblVcTypesRecord, Integer> IDENTITY_TBL_VC_TYPES = Identities0.IDENTITY_TBL_VC_TYPES;
    public static final Identity<TblVerifiersRecord, Integer> IDENTITY_TBL_VERIFIERS = Identities0.IDENTITY_TBL_VERIFIERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<TblBlocksRecord> TBL_BLOCKS_PKEY = UniqueKeys0.TBL_BLOCKS_PKEY;
    public static final UniqueKey<TblDcepRecord> TBL_DCEP_PKEY = UniqueKeys0.TBL_DCEP_PKEY;
    public static final UniqueKey<TblHealthyVerificationClaimRecord> TBL_HEALTHY_VERIFICATION_CLAIM_PKEY = UniqueKeys0.TBL_HEALTHY_VERIFICATION_CLAIM_PKEY;
    public static final UniqueKey<TblIdentitiesRecord> TBL_IDENTITIES_PKEY = UniqueKeys0.TBL_IDENTITIES_PKEY;
    public static final UniqueKey<TblIssuersRecord> TBL_ISSUERS_PKEY = UniqueKeys0.TBL_ISSUERS_PKEY;
    public static final UniqueKey<TblSuspectedPatientsPhoneListRecord> TBL_SUSPECTED_PATIENTS_PHONE_LIST_PKEY = UniqueKeys0.TBL_SUSPECTED_PATIENTS_PHONE_LIST_PKEY;
    public static final UniqueKey<TblTransactionsRecord> TBL_TRANSACTIONS_PKEY = UniqueKeys0.TBL_TRANSACTIONS_PKEY;
    public static final UniqueKey<TblVcTypesRecord> TBL_VC_TYPES_PKEY = UniqueKeys0.TBL_VC_TYPES_PKEY;
    public static final UniqueKey<TblVerifiersRecord> TBL_VERIFIERS_PKEY = UniqueKeys0.TBL_VERIFIERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TblVcTypesRecord, TblIssuersRecord> TBL_VC_TYPES__TBL_VC_TYPES_ISSUER_FKEY = ForeignKeys0.TBL_VC_TYPES__TBL_VC_TYPES_ISSUER_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TblIssuersRecord, Integer> IDENTITY_TBL_ISSUERS = Internal.createIdentity(TblIssuers.TBL_ISSUERS, TblIssuers.TBL_ISSUERS.ID);
        public static Identity<TblVcTypesRecord, Integer> IDENTITY_TBL_VC_TYPES = Internal.createIdentity(TblVcTypes.TBL_VC_TYPES, TblVcTypes.TBL_VC_TYPES.ID);
        public static Identity<TblVerifiersRecord, Integer> IDENTITY_TBL_VERIFIERS = Internal.createIdentity(TblVerifiers.TBL_VERIFIERS, TblVerifiers.TBL_VERIFIERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<TblBlocksRecord> TBL_BLOCKS_PKEY = Internal.createUniqueKey(TblBlocks.TBL_BLOCKS, "tbl_blocks_pkey", new TableField[] { TblBlocks.TBL_BLOCKS.HEIGHT }, true);
        public static final UniqueKey<TblDcepRecord> TBL_DCEP_PKEY = Internal.createUniqueKey(TblDcep.TBL_DCEP, "tbl_dcep_pkey", new TableField[] { TblDcep.TBL_DCEP.SERIAL_NUMBER }, true);
        public static final UniqueKey<TblHealthyVerificationClaimRecord> TBL_HEALTHY_VERIFICATION_CLAIM_PKEY = Internal.createUniqueKey(TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM, "tbl_healthy_verification_claim_pkey", new TableField[] { TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM.ID }, true);
        public static final UniqueKey<TblIdentitiesRecord> TBL_IDENTITIES_PKEY = Internal.createUniqueKey(TblIdentities.TBL_IDENTITIES, "tbl_identities_pkey", new TableField[] { TblIdentities.TBL_IDENTITIES.HEIGHT, TblIdentities.TBL_IDENTITIES.TX_INDEX }, true);
        public static final UniqueKey<TblIssuersRecord> TBL_ISSUERS_PKEY = Internal.createUniqueKey(TblIssuers.TBL_ISSUERS, "tbl_issuers_pkey", new TableField[] { TblIssuers.TBL_ISSUERS.ID }, true);
        public static final UniqueKey<TblSuspectedPatientsPhoneListRecord> TBL_SUSPECTED_PATIENTS_PHONE_LIST_PKEY = Internal.createUniqueKey(TblSuspectedPatientsPhoneList.TBL_SUSPECTED_PATIENTS_PHONE_LIST, "tbl_suspected_patients_phone_list_pkey", new TableField[] { TblSuspectedPatientsPhoneList.TBL_SUSPECTED_PATIENTS_PHONE_LIST.PHONE }, true);
        public static final UniqueKey<TblTransactionsRecord> TBL_TRANSACTIONS_PKEY = Internal.createUniqueKey(TblTransactions.TBL_TRANSACTIONS, "tbl_transactions_pkey", new TableField[] { TblTransactions.TBL_TRANSACTIONS.HEIGHT, TblTransactions.TBL_TRANSACTIONS.TX_INDEX }, true);
        public static final UniqueKey<TblVcTypesRecord> TBL_VC_TYPES_PKEY = Internal.createUniqueKey(TblVcTypes.TBL_VC_TYPES, "tbl_vc_types_pkey", new TableField[] { TblVcTypes.TBL_VC_TYPES.ID }, true);
        public static final UniqueKey<TblVerifiersRecord> TBL_VERIFIERS_PKEY = Internal.createUniqueKey(TblVerifiers.TBL_VERIFIERS, "tbl_verifiers_pkey", new TableField[] { TblVerifiers.TBL_VERIFIERS.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<TblVcTypesRecord, TblIssuersRecord> TBL_VC_TYPES__TBL_VC_TYPES_ISSUER_FKEY = Internal.createForeignKey(Keys.TBL_ISSUERS_PKEY, TblVcTypes.TBL_VC_TYPES, "tbl_vc_types_issuer_fkey", new TableField[] { TblVcTypes.TBL_VC_TYPES.ISSUER }, true);
    }
}
