package com.cts.foodster.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.foodster.bean.Login;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	LoginDAO logindao;
	
	@SuppressWarnings("unchecked")
	public Login Authenticate(Login login) {
		// TODO Auto-generated method stub
		String userId = login.getUserId();
		String password= login.getPassword();
		Login login2 = new Login();
		try {
			Session session= sessionFactory.getCurrentSession();
			String query = "from Login where userId=? and password=?";
			org.hibernate.query.Query<Login> query2 = null;
			query2 = session.createQuery(query);
			query2.setParameter(0, userId);
			query2.setParameter(1, password);
			login2= query2.getSingleResult();
		} catch (Exception e) {
				login2 = null;
		}finally{
			return login2;
		}
	}
public String registerAdmin(Login login) {
		String ans = null;
		try {
			if(logindao.getUser(login.getUserId()) == null ){
			sessionFactory.getCurrentSession().save(login);
			ans = "yes";}
			else
				ans = "no";
		} catch (Exception e) {
			ans = "no";
		}finally {
			return ans;
		}
		
		
		
		
	}
@Override
public Login getUser(String id) {
	// TODO Auto-generated method stub
	Login login2 = new Login();
	try {
	Session session= sessionFactory.getCurrentSession();
	String query = "from Login where userId=?";
	org.hibernate.query.Query<Login> query2 = null;
	query2 = session.createQuery(query);
	query2.setParameter(0, id);
	login2= query2.getSingleResult();
} catch (Exception e) {
		login2 = null;
}finally{
	return login2;
}
}

}
