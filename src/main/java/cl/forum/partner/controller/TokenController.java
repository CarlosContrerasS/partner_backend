package cl.forum.partner.controller;

import cl.forum.partner.model.Token;
import cl.forum.partner.model.TokenResponse;
import cl.forum.partner.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("token")
public class TokenController {
    String url = "https://keycloak-single-sing-on.apps.forumdevelopers.n97u.p1.openshiftapps.com/auth/realms/forum-developers/protocol/openid-connect/token";


    @Autowired
    private IService service;

    @GetMapping("/autorizacion")
    public ResponseEntity<Token> token() throws JsonProcessingException {


        TokenResponse tokenRespuesta = service.entregarToken(url);
        Token token = new Token();

        token.setToken(tokenRespuesta.getAccessToken());

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @GetMapping("/renueva")
    public ResponseEntity<Token> renuevaToken() throws JsonProcessingException {

        TokenResponse tokenRespuesta = service.entregarToken(url);
        Token token = new Token();

        token.setToken(tokenRespuesta.getAccessToken());

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

}
