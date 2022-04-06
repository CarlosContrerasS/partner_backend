package cl.forum.partner.model;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class TokenResponse {
    private String accessToken;
    private long expiresIn;
    private long refreshExpiresIn;
    private String refreshToken;
    private String tokenType;
    private long notBeforePolicy;
    private UUID sessionState;
    private String scope;

    @JsonProperty("access_token")
    public String getAccessToken() { return accessToken; }
    @JsonProperty("access_token")
    public void setAccessToken(String value) { this.accessToken = value; }

    @JsonProperty("expires_in")
    public long getExpiresIn() { return expiresIn; }
    @JsonProperty("expires_in")
    public void setExpiresIn(long value) { this.expiresIn = value; }

    @JsonProperty("refresh_expires_in")
    public long getRefreshExpiresIn() { return refreshExpiresIn; }
    @JsonProperty("refresh_expires_in")
    public void setRefreshExpiresIn(long value) { this.refreshExpiresIn = value; }

    @JsonProperty("refresh_token")
    public String getRefreshToken() { return refreshToken; }
    @JsonProperty("refresh_token")
    public void setRefreshToken(String value) { this.refreshToken = value; }

    @JsonProperty("token_type")
    public String getTokenType() { return tokenType; }
    @JsonProperty("token_type")
    public void setTokenType(String value) { this.tokenType = value; }

    @JsonProperty("not-before-policy")
    public long getNotBeforePolicy() { return notBeforePolicy; }
    @JsonProperty("not-before-policy")
    public void setNotBeforePolicy(long value) { this.notBeforePolicy = value; }

    @JsonProperty("session_state")
    public UUID getSessionState() { return sessionState; }
    @JsonProperty("session_state")
    public void setSessionState(UUID value) { this.sessionState = value; }

    @JsonProperty("scope")
    public String getScope() { return scope; }
    @JsonProperty("scope")
    public void setScope(String value) { this.scope = value; }
}
