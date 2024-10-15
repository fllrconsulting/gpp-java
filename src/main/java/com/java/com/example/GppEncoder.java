package com.java.com.example;

import com.iab.gpp.encoder.GppModel;
import com.iab.gpp.encoder.field.UsNatV1Field;
import com.iab.gpp.encoder.section.UsNatV1;

import java.util.Arrays;

public class GppEncoder {
    public static void main(String[] args) {
        try {
            // Create a new GppModel instance
            GppModel gppModel = new GppModel();

            // Set values for UsNatV1 fields
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.VERSION, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SHARING_NOTICE, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SALE_OPT_OUT_NOTICE, 1);  
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SHARING_OPT_OUT_NOTICE, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.TARGETED_ADVERTISING_OPT_OUT_NOTICE, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE, 0);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SENSITIVE_DATA_LIMIT_USE_NOTICE, 0);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SALE_OPT_OUT, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SHARING_OPT_OUT, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.TARGETED_ADVERTISING_OPT_OUT, 2);

            // For array fields, convert int[] to List<Integer>
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.SENSITIVE_DATA_PROCESSING, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, Arrays.asList(0, 0));

            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.PERSONAL_DATA_CONSENTS, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.MSPA_COVERED_TRANSACTION, 2);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.MSPA_OPT_OUT_OPTION_MODE, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.MSPA_SERVICE_PROVIDER_MODE, 2);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.GPC_SEGMENT_TYPE, 1);
            gppModel.setFieldValue(UsNatV1.NAME, UsNatV1Field.GPC, false);

            // Encode the GPP string
            String gppString = gppModel.encode();

            // Print the encoded GPP string
            System.out.println("Encoded GPP String: " + gppString);

        } catch (Exception e) {
            System.out.println("Error encoding GPP string: " + e.getMessage());
        }
    }
}
