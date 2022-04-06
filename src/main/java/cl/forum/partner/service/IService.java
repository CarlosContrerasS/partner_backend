package cl.forum.partner.service;

import cl.forum.partner.model.TokenResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IService {
    TokenResponse entregarToken(String url) throws JsonProcessingException;
}
