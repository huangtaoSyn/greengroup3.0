package com.yidao.greengroup.service;

import com.yidao.greengroup.po.Enginer.*;
import com.yidao.greengroup.po.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 10:21
 * @version: $version$
 */

public interface T10Service {
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

	//public PageResult findPage2(int pageNum, int pageSize);
}
