package ezen.yorizori.domain.cookbook.service;

import ezen.yorizori.domain.common.factory.DaoFactory;
import ezen.yorizori.domain.cookbook.dao.CookbookDao;
import ezen.yorizori.domain.cookbook.dto.Cookbook;

public class CookbookServiceImpl implements CookbookService {
	
	private CookbookDao cookbookDao = DaoFactory.getInstance().getCookbookDao();
	

	@Override
	public void registerBook(Cookbook cookbook) {

	}

}
