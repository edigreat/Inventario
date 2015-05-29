package mcc.data;

import java.util.List;

import mcc.beans.Rol;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for Rol
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see mcc.beans.Rol
 * @author MyEclipse Persistence Tools
 */
@Repository
public class RolDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(RolDAO.class);

	public void save(Rol transientInstance) {
		log.debug("saving Rol instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Rol persistentInstance) {
		log.debug("deleting Rol instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Rol findById(java.lang.Integer id) {
		log.debug("getting Rol instance with id: " + id);
		try {
			Rol instance = (Rol) getSession().get("mcc.data.Rol", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Rol instance) {
		log.debug("finding Rol instance by example");
		try {
			List results = getSession().createCriteria("mcc.data.Rol")
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
		log.debug("finding Rol instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Rol as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Rol instances");
		try {
			String queryString = "from Rol";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	
}