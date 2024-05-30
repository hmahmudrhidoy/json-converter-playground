package com.codemechanix.jsonconverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.codemechanix.jsonconverter.dto.JsonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JsonController {

    @GetMapping("/json")
    public ResponseEntity<JsonResponse> getJson() {
        String jsonString = "{ \"mappings\": { \"_doc\": { \"properties\": { \"_class\": { \"type\": \"text\", \"fields\": { \"keyword\": { \"type\": \"keyword\", \"ignore_above\": 256 } } }, \"id\": { \"type\": \"text\", \"fields\": { \"keyword\": { \"type\": \"keyword\", \"ignore_above\": 256 } } } } } } }";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonResponse jsonResponse = null;
        try {
            jsonResponse = objectMapper.readValue(jsonString, JsonResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(jsonResponse);
    }
}