package com.nischitha.service;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.nischitha.exceptions.AdminException;
	import com.nischitha.model.Admin;
	import com.nischitha.repository.AdminRepo;


	@Service
	public class AdminServiceImpl implements AdminService {
		
		@Autowired
		private AdminRepo ar;

		@Override
		public Admin addAdmin(Admin admin)throws AdminException {
			
			 Admin adm = ar.findByAdminUserNameAndAdminPassword(admin.getAdminUserName(),admin.getAdminPassword());
			 
			 if(adm!=null)
			 {
				 throw  new AdminException("Admin Already Exists..");
			 }
			 else
			 {
				 return ar.save(admin);
			 }
//			return ar.save(admin);
			
		}
		
		

	}
