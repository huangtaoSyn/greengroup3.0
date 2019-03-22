package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.Enginer.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 4:00
 * @version: $version$
 */
@Repository
public interface T10Mapper {
	public void addT10Data(T10 t10);
	public void addT11Data(T11 t11);
	public void addT15Data(T15 t15);
	public void addT16Data(T16 t16);
	public void addT17Data(T17 t17);
	public void addT18Data(T18 t18);
	public void addT19Data(T19 t19);
	public void addT21Data(T21 t21);
	public void addT22Data(T22 t22);
	public void addT24Data(T24 t24);
	public void addT26Data(T26 t26);
	public void addT27Data(T27 t27);
	public void addT28Data(T28 t28);
	public void addT29Data(T29 t29);
	public void addT30Data(T30 t30);
	public void addT40Data(T40 t40);
	public void addT41Data(T41 t41);
	public void addT42Data(T42 t42);
	public void addT43Data(T43 t43);
	public void addT44Data(T44 t44);
    //发送数据
	public T10 findT10Data();
	public T11 findT11Data();
	public T15 findT15Data();
	public T16 findT16Data();
	public T17 findT17Data();
	public T18 findT18Data();
	public T19 findT19Data();
	public T21 findT21Data();
	public T22 findT22Data();
	public T24 findT24Data();
	public T26 findT26Data();
	public T27 findT27Data();
	public T28 findT28Data();
	public T29 findT29Data();
	public T30 findT30Data();
	public T40 findT40Data();
	public T41 findT41Data();
	public T42 findT42Data();
	public T43 findT43Data();
	public T44 findT44Data();

	public List<T10> findT10Data50();
	public List<T11> findT11Data50();
	public List<T15> findT15Data50();
	public List<T16> findT16Data50();
	public List<T17> findT17Data50();
	public List<T18> findT18Data50();
	public List<T19> findT19Data50();
	public List<T21> findT21Data50();
	public List<T22> findT22Data50();
	public List<T24> findT24Data50();
	public List<T16> findT26Data50();
	public List<T27> findT27Data50();
	public List<T28> findT28Data50();
	public List<T29> findT29Data50();
	public List<T30> findT30Data50();
	public List<T40> findT40Data50();
	public List<T41> findT41Data50();
	public List<T42> findT42Data50();
	public List<T43> findT43Data50();
	public List<T44> findT44Data50();

   // public List<>findAllSwitch1();




}
