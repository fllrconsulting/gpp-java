package com.java.com.example;

import com.iab.gpp.encoder.GppModel;
import com.iab.gpp.encoder.section.UsNatV1;  // Import UsNatV1 for US National Ad Tech section
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

public class GppDecoder {
    public static void main(String[] args) {
        String gppString = "DBABLA~BVQqAAAACgA.QA";  // Example GPP string to decode

        try {
            // Decode the GPP string
            GppModel gppModel = new GppModel(gppString);

            // Access the UsNatV1 (US National Ad Tech v1) section
            UsNatV1 usNatV1 = (UsNatV1) gppModel.getSection(UsNatV1.ID);

            // Use LinkedHashMap to maintain the insertion order of fields
            Map<String, Object> usNatV1Data = new LinkedHashMap<>();
            usNatV1Data.put("Version", usNatV1.getVersion());
            usNatV1Data.put("SharingNotice", usNatV1.getSharingNotice());
            usNatV1Data.put("SaleOptOutNotice", usNatV1.getSaleOptOutNotice());
            usNatV1Data.put("SharingOptOutNotice", usNatV1.getSharingOptOutNotice());
            usNatV1Data.put("TargetedAdvertisingOptOutNotice", usNatV1.getTargetedAdvertisingOptOutNotice());
            usNatV1Data.put("SensitiveDataProcessingOptOutNotice", usNatV1.getSensitiveDataProcessingOptOutNotice());
            usNatV1Data.put("SensitiveDataLimitUseNotice", usNatV1.getSensitiveDataLimitUseNotice());
            usNatV1Data.put("SaleOptOut", usNatV1.getSaleOptOut());
            usNatV1Data.put("SharingOptOut", usNatV1.getSharingOptOut());
            usNatV1Data.put("TargetedAdvertisingOptOut", usNatV1.getTargetedAdvertisingOptOut());
            usNatV1Data.put("SensitiveDataProcessing", usNatV1.getSensitiveDataProcessing());
            usNatV1Data.put("KnownChildSensitiveDataConsents", usNatV1.getKnownChildSensitiveDataConsents());
            usNatV1Data.put("PersonalDataConsents", usNatV1.getPersonalDataConsents());
            usNatV1Data.put("MspaCoveredTransaction", usNatV1.getMspaCoveredTransaction());
            usNatV1Data.put("MspaOptOutOptionMode", usNatV1.getMspaOptOutOptionMode());
            usNatV1Data.put("MspaServiceProviderMode", usNatV1.getMspaServiceProviderMode());
            usNatV1Data.put("GpcSegmentType", usNatV1.getGpcSegmentType());
            usNatV1Data.put("GpcSegmentIncluded", usNatV1.getGpcSegmentIncluded());
            usNatV1Data.put("Gpc", usNatV1.getGpc());

            // Wrap the result in a map with the correct key "usnatv1"
            Map<String, Object> resultData = new LinkedHashMap<>();
            resultData.put("usnatv1", usNatV1Data);

            // Convert the map to JSON using Jackson ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultData);

            // Print the JSON result
            System.out.println(jsonResult);

        } catch (Exception e) {
            System.out.println("Error decoding GPP string: " + e.getMessage());
        }
    }
}
