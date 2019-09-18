package com.dev.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dao.IAbonnementDao;
import com.dev.entities.Abonnement;

@Transactional
@Service
public class AbonnementServiceImpl implements IAbonnementService {

	private IAbonnementDao dao;
	
	public void setDao(IAbonnementDao dao) {
		this.dao = dao;
	}

	@Override
	public void addAbonnement(Abonnement abonnement) {
		dao.addAbonnement(abonnement);
	}

	@Override
	public List<Abonnement> listeAbonnements(boolean actif) {
		return dao.listeAbonnements(actif);
	}

	@Override
	public List<Abonnement> listeAbonnements(Date d1, Date d2) {
		return dao.listeAbonnements(d1, d2);
	}

	@Override
	public Abonnement getAbonnement(Long idAbonnement) {
		return dao.getAbonnement(idAbonnement);
	}

	@Override
	public void deleteAbonnement(Long idAbonnement) {
		dao.deleteAbonnement(idAbonnement);
	}

	@Override
	public void updateAbonnement(Abonnement abonnement) {
		dao.updateAbonnement(abonnement);
	}

	@Override
	public void consomer(Long idAbonnement, double montant) {
		dao.consomer(idAbonnement, montant);
	}

}
