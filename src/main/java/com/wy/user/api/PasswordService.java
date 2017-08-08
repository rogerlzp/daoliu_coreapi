package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.PasswordEnter;
import com.wy.user.dto.PasswordResult;

 /**
 * ClassName: BPasswordService
 * @Description: update password
 * @author Ciro
 * @date 2015-11-25
 */
public interface PasswordService {
	
		/**
		 * @Description: update passsword
		 * @param @param pwe
		 * @param @return   
		 * @return PasswordResult  
		 * @throws
		 * @author Ciro
		 * @date 2015-11-26
		 */
		@Role
		public PasswordResult updateUserPwd(PasswordEnter pwe);
		/**
		 * @Description: retrieve passsword
		 * @param @param pwe
		 * @param @return   
		 * @return PasswordResult  
		 * @throws
		 * @author Ciro
		 * @date 2015-11-26
		 */
		public PasswordResult retrieveUserPwd(PasswordEnter pwe);
}
