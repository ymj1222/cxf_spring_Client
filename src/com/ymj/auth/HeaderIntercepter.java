package com.ymj.auth;
 
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class HeaderIntercepter extends AbstractSoapInterceptor {
	private String qname;
 
	public HeaderIntercepter() {
		super(Phase.WRITE);
	}
 
	public void handleMessage(SoapMessage soapMessage) throws Fault {
 
		System.out.println("客户端开始验证 ");
		String spName = "ymj";
		String spPassword = "223618";
 
		QName name = new QName("RequestSOAPHeader");
		Document doc = DOMUtils.createDocument();
 
		Element spId = doc.createElement("a");
		spId.setTextContent(spName);
 
		Element spPass = doc.createElement("b");
		spPass.setTextContent(spPassword);
 
		Element root = doc.createElementNS(qname, "tns:RequestSOAPHeader");
		root.appendChild(spId);
		root.appendChild(spPass);
 
		SoapHeader head = new SoapHeader(name, root);
		List<Header> headers = soapMessage.getHeaders();
		headers.add(head);
 
	}
 
	public String getQname() {
		return qname;
	}
 
	public void setQname(String qname) {
		this.qname = qname;
	}
}
