package org.springframework.qzb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * UserEntity.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 21:24:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

	private String userId;

	private String username;

}
