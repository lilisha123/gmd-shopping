package com.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springcloud.entity.Users;

/**
 * �־û��㣺�����USERS����в����ķ���
 * 
 * @author lala
 *
 */
public interface UsersRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {
	/**
	 * �ж��û���¼�Ƿ�ɹ�
	 * 
	 * @param userId       �û����
	 * @param userPassword �û�����
	 * @param jdictionId   �û�Ȩ�ޱ��
	 * @return �ɹ����ص�¼�û�������Ϣ��ʧ�ܷ���null
	 */
	@Query("select new com.springcloud.entity.Users(u.userId,u.userName,u.userNumber,u.userPassword,"
			+ "u.userSex,u.userPhone,u.userSite,u.userBirthday,u.userEmail,u.userPhoto,u.jdictionId,u.userStatus) "
			+ "from Users u where u.userId=:userId and u.userPassword=:userPassword and u.jdictionId=:jdictionId and u.userStatus=0")
	public abstract Users login(@Param("userId") Integer userId, @Param("userPassword") String userPassword,
			@Param("jdictionId") Integer jdictionId);

	/**
	 * �޸�USERS����ָ����ŵ��û�״̬
	 * 
	 * @param userId     �û����
	 * @param userStatus �û�״̬
	 * @return �޸ĳɹ����ش���0 ��������ʧ�ܷ���0
	 */
	@Modifying
	@Query("update Users set userStatus=:userStatus where userId=:userId")
	public abstract Integer updateStatus(@Param("userId") Integer userId, @Param("userStatus") Integer userStatus);

	/**
	 * 修改users表中指定user_id 的用户信息
	 * 
	 * @param users 用户信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	@Modifying
	@Query("update Users u set u.userNumber=:#{#users.userNumber},u.userSex=:#{#users.userSex},u.userPhone=:#{#users.userPhone},u.userBirthday=:#{#users.userBirthday},"
			+ "u.userEmail=:#{#users.userEmail},u.userSite=:#{#users.userSite} where u.userId=:#{#users.userId}")
	public abstract Integer update(@Param("users") Users users);

	/**
	 * 修改users表中指定user_id的用户头像
	 * 
	 * @param users 修改用户的信息
	 * @return 成功于等于0返回大于0 的整数，失败返回小于0的整数
	 */
	@Modifying
	@Query("update Users u set u.userPhoto=:#{#users.userPhoto} where u.userId=:#{#users.userId}")
	public abstract Integer updatePhoto(@Param("users") Users users);

	/**
	 * 修改users表中指定user_id的用户密码
	 * 
	 * @param users 修改用户的信息
	 * @return 成功于等于0返回大于0 的整数，失败返回小于0的整数
	 */
	@Modifying
	@Query("update Users u set u.userPassword=:#{#users.userPassword} where u.userId=:#{#users.userId}")
	public abstract Integer updatePassword(@Param("users") Users users);

	/**
	 * 修改users表中指定user_id的用户名称
	 * 
	 * @param users 修改用户的信息
	 * @return 成功于等于0返回大于0 的整数，失败返回小于0的整数
	 */
	@Modifying
	@Query("update Users u set u.userName=:#{#users.userName} where u.userId=:#{#users.userId}")
	public abstract Integer updateName(@Param("users") Users users);

}
