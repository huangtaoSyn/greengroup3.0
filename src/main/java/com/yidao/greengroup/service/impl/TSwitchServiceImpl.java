package com.yidao.greengroup.service.impl;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-12 13:06
 * @version: $version$
 */

import com.yidao.greengroup.dao.TSwitchMapper;
import com.yidao.greengroup.po.Enginer.*;
import com.yidao.greengroup.service.TSwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName huang
 *@Description TODO
 *@Author 20354
 *@Date 13:06
 *@Version 1.0
 */
@Service
public class TSwitchServiceImpl implements TSwitchService {
	@Autowired
	TSwitchMapper tSwitchMapper;
	@Override
	public void addT10Switch(T10Switch t10Switch) {
		tSwitchMapper.addT10Switch(t10Switch);
	}

	@Override
	public void addT11Switch(T11Switch t11Switch) {
		tSwitchMapper.addT11Switch(t11Switch);
	}

	@Override
	public void addT15Switch(T15Switch t15Switch) {
		tSwitchMapper.addT15Switch(t15Switch);
	}

	@Override
	public void addT16Switch(T16Switch t16Switch) {
		tSwitchMapper.addT16Switch(t16Switch);
	}

	@Override
	public void addT17Switch(T17Switch t17Switch) {
		tSwitchMapper.addT17Switch(t17Switch);
	}

	@Override
	public void addT18Switch(T18Switch t18Switch) {
		tSwitchMapper.addT18Switch(t18Switch);
	}

	@Override
	public void addT19Switch(T19Switch t19Switch) {
		tSwitchMapper.addT19Switch(t19Switch);
	}

	@Override
	public void addT21Switch(T21Switch t21Switch) {
		tSwitchMapper.addT21Switch(t21Switch);
	}

	@Override
	public void addT22Switch(T22Switch t22Switch) {
		tSwitchMapper.addT22Switch(t22Switch);
	}

	@Override
	public void addT24Switch(T24Switch t24Switch) {
		tSwitchMapper.addT24Switch(t24Switch);
	}

	@Override
	public void addT26Switch(T26Switch t26Switch) {
		tSwitchMapper.addT26Switch(t26Switch);
	}

	@Override
	public void addT27Switch(T27Switch t27Switch) {
		tSwitchMapper.addT27Switch(t27Switch);
	}

	@Override
	public void addT28Switch(T28Switch t28Switch) {
		tSwitchMapper.addT28Switch(t28Switch);
	}

	@Override
	public void addT29Switch(T29Switch t29Switch) {
		tSwitchMapper.addT29Switch(t29Switch);
	}

	@Override
	public void addT30Switch(T30Switch t30Switch) {
		tSwitchMapper.addT30Switch(t30Switch);
	}

	@Override
	public void addT40Switch(T40Switch t40Switch) {
		tSwitchMapper.addT40Switch(t40Switch);
	}

	@Override
	public void addT41Switch(T41Switch t41Switch) {
		tSwitchMapper.addT41Switch(t41Switch);
	}

	@Override
	public void addT42Switch(T42Switch t42Switch) {
		tSwitchMapper.addT42Switch(t42Switch);
	}

	@Override
	public void addT43Switch(T43Switch t43Switch) {
		tSwitchMapper.addT43Switch(t43Switch);
	}

	@Override
	public void addT44Switch(T44Switch t44Switch) {
		tSwitchMapper.addT44Switch(t44Switch);
	}




	@Override
	public List<T10Switch> findT10Switch() {
		return tSwitchMapper.findT10Switch();
	}

	@Override
	public List<T11Switch> findT11Switch() {
		return tSwitchMapper.findT11Switch();
	}

	@Override
	public List<T15Switch> findT15Switch() {
		return tSwitchMapper.findT15Switch();
	}

	@Override
	public List<T16Switch> findT16Switch() {
		return tSwitchMapper.findT16Switch();
	}

	@Override
	public List<T17Switch> findT17Switch() {
		return tSwitchMapper.findT17Switch();
	}

	@Override
	public List<T18Switch> findT18Switch() {
		return tSwitchMapper.findT18Switch();
	}

	@Override
	public List<T19Switch> findT19Switch() {
		return tSwitchMapper.findT19Switch();
	}

	@Override
	public List<T21Switch> findT21Switch() {
		return tSwitchMapper.findT21Switch();
	}

	@Override
	public List<T22Switch> findT22Switch() {
		return tSwitchMapper.findT22Switch();
	}

	@Override
	public List<T24Switch> findT24Switch() {
		return tSwitchMapper.findT24Switch();
	}

	@Override
	public List<T26Switch> findT26Switch() {
		return tSwitchMapper.findT26Switch();
	}

	@Override
	public List<T27Switch> findT27Switch() {
		return tSwitchMapper.findT27Switch();
	}

	@Override
	public List<T28Switch> findT28Switch() {
		return tSwitchMapper.findT28Switch();
	}

	@Override
	public List<T29Switch> findT29Switch() {
		return tSwitchMapper.findT29Switch();
	}

	@Override
	public List<T30Switch> findT30Switch() {
		return tSwitchMapper.findT30Switch();
	}

	@Override
	public List<T40Switch> findT40Switch() {
		return tSwitchMapper.findT40Switch();
	}

	@Override
	public List<T41Switch> findT41Switch() {
		return tSwitchMapper.findT41Switch();
	}

	@Override
	public List<T42Switch> findT42Switch() {
		return tSwitchMapper.findT42Switch();
	}

	@Override
	public List<T43Switch> findT43Switch() {
		return tSwitchMapper.findT43Switch();
	}

	@Override
	public List<T44Switch> findT44Switch() {
		return tSwitchMapper.findT44Switch();
	}

	@Override
	public T10Switch findT10Switch1() {
		return tSwitchMapper.findT10Switch1();
	}

	@Override
	public T11Switch findT11Switch1() {
		return tSwitchMapper.findT11Switch1();
	}

	@Override
	public T15Switch findT15Switch1() {
		return tSwitchMapper.findT15Switch1();
	}

	@Override
	public T16Switch findT16Switch1() {
		return tSwitchMapper.findT16Switch1();
	}

	@Override
	public T17Switch findT17Switch1() {
		return tSwitchMapper.findT17Switch1();
	}

	@Override
	public T18Switch findT18Switch1() {
		return tSwitchMapper.findT18Switch1();
	}

	@Override
	public T19Switch findT19Switch1() {
		return tSwitchMapper.findT19Switch1();
	}

	@Override
	public T21Switch findT21Switch1() {
		return tSwitchMapper.findT21Switch1();
	}

	@Override
	public T22Switch findT22Switch1() {
		return tSwitchMapper.findT22Switch1();
	}

	@Override
	public T24Switch findT24Switch1() {
		return tSwitchMapper.findT24Switch1();
	}

	@Override
	public T26Switch findT26Switch1() {
		return tSwitchMapper.findT26Switch1();
	}

	@Override
	public T27Switch findT27Switch1() {
		return tSwitchMapper.findT27Switch1();
	}

	@Override
	public T28Switch findT28Switch1() {
		return tSwitchMapper.findT28Switch1();
	}

	@Override
	public T29Switch findT29Switch1() {
		return tSwitchMapper.findT29Switch1();
	}

	@Override
	public T30Switch findT30Switch1() {
		return tSwitchMapper.findT30Switch1();
	}

	@Override
	public T40Switch findT40Switch1() {
		return tSwitchMapper.findT40Switch1();
	}

	@Override
	public T41Switch findT41Switch1() {
		return tSwitchMapper.findT41Switch1();
	}

	@Override
	public T42Switch findT42Switch1() {
		return tSwitchMapper.findT42Switch1();
	}

	@Override
	public T43Switch findT43Switch1() {
		return tSwitchMapper.findT43Switch1();
	}

	@Override
	public T44Switch findT44Switch1() {
		return tSwitchMapper.findT44Switch1();
	}
}
