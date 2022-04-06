package cl.forum.partner.service.Impl;

import cl.forum.partner.model.TokenResponse;
import cl.forum.partner.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceImpl implements IService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public TokenResponse entregarToken(String url) throws JsonProcessingException {

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.valueOf("application/x-www-form-urlencoded"));

        //Desarrollo
        //String parametros = "client_id=0c1513d3&username=showcase-dev-user&password=Sc2022Forum&grant_type=password&client_secret=12ee003b5c6e87027c8bebe77dd3e1eb";
        //Para Nube
        String parametros = "client_id=9e711608&username=user-poc_volvo&password=b5teKQLYGH&grant_type=password&client_secret=8bb5495f177974ca056cd1341bca4a85";

        HttpEntity<String> request = new HttpEntity<>(parametros,  headers);

        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST, request , Object.class);

        ObjectMapper mapper = new ObjectMapper();

        String respuesta = mapper.writeValueAsString(response.getBody());

        return mapper.readValue(respuesta, new TypeReference<TokenResponse>() {});
    }
}
