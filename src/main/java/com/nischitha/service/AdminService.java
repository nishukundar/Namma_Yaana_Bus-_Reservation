package com.nischitha.service;

	import com.nischitha.exceptions.AdminException;
	import com.nischitha.model.Admin;

	public interface AdminService {
		
		public Admin addAdmin(Admin admin)throws AdminException;

	}
