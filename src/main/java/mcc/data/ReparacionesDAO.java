package mcc.data;

import java.util.List;

import mcc.beans.Reparaciones;

import org.hibernate.FetchMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * Reparaciones entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see mcc.beans.Reparaciones
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ReparacionesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ReparacionesDAO.class);

	public void save(Reparaciones transientInstance) {
		log.debug("saving Reparaciones instance");
		Session session = getSession();
    	Transaction txt = session.beginTransaction();
		
		try {
			session.save(transientInstance);
			txt.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			txt.rollback();
			throw re;
		}
		finally {
        	session.close();
        } 
	}

	public void delete(Reparaciones persistentInstance) {
		log.debug("deleting Reparaciones instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Reparaciones findById(java.lang.Integer id) {
		log.debug("getting Reparaciones instance with id: " + id);
		try {
			Reparaciones instance = (Reparaciones) getSession().get(
					"mcc.beans.Reparaciones", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Reparaciones instance) {
		log.debug("finding Reparaciones instance by example");
		try {
			List results = getSession().createCriteria("mcc.beans.Reparaciones")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Reparaciones instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Reparaciones as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Reparaciones> findAll() {
		log.debug("finding all Reparaciones instances");
		try {
			return getSession().createCriteria(Reparaciones.class)
					.setFetchMode("equipos", FetchMode.JOIN)
					.setFetchMode("usuario", FetchMode.JOIN)
					.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Reparaciones merge(Reparaciones detachedInstance) {
		log.debug("merging Reparaciones instance");
		try {
			Reparaciones result = (Reparaciones) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Reparaciones instance) {
		log.debug("attaching dirty Reparaciones instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Reparaciones instance) {
		log.debug("attaching clean Reparaciones instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}