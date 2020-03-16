package com.mentor.Dao;

import java.util.List;



import com.mentor.model.Mentor;
import com.mentor.model.TrainingDetails;
import com.mentor.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceDaoImpl implements UserServiceDao {

    private static final Logger logger= LoggerFactory.getLogger(UserServiceDaoImpl.class)
    private SessionFactory sessionFactory;
    public UserServiceDaoImpl(SessionFactory aSessionFactory)
    {
        this.sessionFactory = aSessionFactory;
    }

	public void createProfile(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
        logger.info("User saved successfully, user details "+user);
    }
	
	public Mentor viewMentor(int mentorId) {
        Session session = this.sessionFactory.getCurrentSession();
        Mentor mentor = (Mentor) session.load(Mentor.class, new Integer(mentorId));
        logger.info("Mentor details "+mentor);
		return mentor;
	}

	public List<Mentor> searchMentor(String technology) {
        String query = "SELECT * from Mentor where technology like '%"+technology+"%' ";
        Session session = this.sessionFactory.getCurrentSession();
        List<Mentor> mentorList = session.createQuery(query).list();
        return mentorList;
	}

	public Mentor selectMentor(int mentorId) {
        Session session = this.sessionFactory.getCurrentSession();
        Mentor mentor = (Mentor) session.get(Mentor.class, new Integer(mentorId));
        if(mentor != null)
            logger.info("Mentor found successfully, Mentor details "+mentor);
        return mentor;
	}

	public boolean sendProposal(int userId, int mentorId) {
        String query = "SELECT count(*) FROM TrainingDetails WHERE user_id='"+userId+"' AND mentor_id='"+mentorId+"'";
        Session session = this.sessionFactory.getCurrentSession();
        session.createQuery(query);
		return false;
	}

	public boolean assignRating(int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<TrainingDetails> viewTrainings(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
