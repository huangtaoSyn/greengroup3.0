package com.yidao.greengroup.po.FinalResult;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 22:27
 * @version: $version$
 */
public class FinalResult {
	public int idFinal ;//基地id
	public String baseFinalName;//基地名称
    public String pFinalNmae;//存放 生产线名称，
    public List<FinalDevice> finalDeviceLists;

	public int getIdFinal() {
		return idFinal;
	}

	public void setIdFinal(int idFinal) {
		this.idFinal = idFinal;
	}

	public String getBaseFinalName() {
		return baseFinalName;
	}

	public void setBaseFinalName(String baseFinalName) {
		this.baseFinalName = baseFinalName;
	}

	public String getpFinalNmae() {
		return pFinalNmae;
	}

	public void setpFinalNmae(String pFinalNmae) {
		this.pFinalNmae = pFinalNmae;
	}

	public List<FinalDevice> getFinalDeviceLists() {
		return finalDeviceLists;
	}

	public void setFinalDeviceLists(List<FinalDevice> finalDeviceLists) {
		this.finalDeviceLists = finalDeviceLists;
	}

	@Override
	public String toString() {
		return "FinalResult{" +
				"idFinal=" + idFinal +
				", baseFinalName='" + baseFinalName + '\'' +
				", pFinalNmae='" + pFinalNmae + '\'' +
				", finalDeviceLists=" + finalDeviceLists +
				'}';
	}
}
