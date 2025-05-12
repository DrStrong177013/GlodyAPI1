package com.glody.glodyAPI.model.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNationalityId implements Serializable {

    private Integer userId;
    private Integer countryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserNationalityId)) return false;
        UserNationalityId that = (UserNationalityId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(countryId, that.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, countryId);
    }
}