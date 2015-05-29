package mcc.data;

import java.util.List;

import mcc.beans.Equipos;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * Equipos entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see mcc.beans.Equipos
 * @author MyEclipse Persistence Tools
 */
@Repository
public class EquiposDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(EquiposDAO.class);

	public void save(Equipos transientInstance) {
		log.debug("saving Equipos instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Equipos persistentInstance) {
		log.debug("deleting Equipos instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Equipos findById(java.lang.Integer id) {
		log.debug("getting Equipos instance with id: " + id);
		try {
			Equipos instance = (Equipos) getSession().get("mcc.data.Equipos",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Equipos instance) {
		log.debug("finding Equipos instance by example");
		try {
			List results = getSession().createCriteria("mcc.data.Equipos")
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
		log.debug("finding Equipos instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Equipos as model where model."
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
		log.debug("finding all Equipos instances");
		try {
			String queryString = "from Equipos";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Equipos merge(Equipos detachedInstance) {
		log.debug("merging Equipos instance");
		try {
			Equipos result = (Equipos) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Equipos instance) {
		log.debug("attaching dirty Equipos instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Equipos instance) {
		log.debug("attaching clean Equipos instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}