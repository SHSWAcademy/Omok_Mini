package users;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class User {
	private int seqId;               // SEQ_ID (PK)
    private String userId;           // USER_ID
    private String userPw;           // USER_PW
    private String email;            // EMAIL
    private LocalDateTime createdAt; // CREATED_AT
    private LocalDateTime deletedAt; // DELETED_AT
    private String nickname;         // NICKNAME

    public User() {}

    public User(int seqId, String userId, String userPw, String email,
                LocalDateTime createdAt, LocalDateTime deletedAt, String nickname) {
        this.seqId = seqId;
        this.userId = userId;
        this.userPw = userPw;
        this.email = email;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.nickname = nickname;
    }

    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
