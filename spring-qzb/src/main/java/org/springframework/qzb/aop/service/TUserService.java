package org.springframework.qzb.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TUserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Lazy
	private TUserService tUserService;

//	 `id` bigint unsigned NOT NULL COMMENT '主键id',
//  `org_id` char(36) DEFAULT '' COMMENT '机构id',
//  `username` varchar(100) DEFAULT '' COMMENT '账号，唯一',
//  `cn_name` varchar(200) DEFAULT '' COMMENT '中文姓名',
//  `user_status` tinyint DEFAULT '0' COMMENT '用户状态：0-启用，1-禁用',
//  `deleted` tinyint DEFAULT '0' COMMENT '删除标识：0-未删除，1-已删除',
//  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',

	@Transactional
	public void test() {
		jdbcTemplate.execute("insert into t_user(id, org_id, username, cn_name, user_status, deleted) values (1, \"123\", \"账号111\", \"姓名111\", 0, 0)");
//		jdbcTemplate.execute("insert into t_user(id, org_id, username, cn_name, user_status, deleted) values (2, \"123\", \"账号111\", \"姓名111\", 0, 0)");
		try {
			tUserService.aaa();
		} catch (Exception e) {

		}
	}

	@Transactional(rollbackFor = Exception.class)
	public void aaa() throws Exception {
		jdbcTemplate.execute("insert into t_user(id, org_id, username, cn_name, user_status, deleted) values (2, \"123\", \"账号111\", \"姓名111\", 0, 0)");
		throw new Exception("111");
	}

}
