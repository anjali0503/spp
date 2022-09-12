package com.mindgate.main.domain;

import java.util.Arrays;
import java.util.Objects;

public class DocumentDetails {

	private int documentId;
	private String documentType;
	private String documentFormate;
	private byte[] documentFile;
	
	public DocumentDetails() {
		// TODO Auto-generated constructor stub
	}

	public DocumentDetails(int documentId, String documentType, String documentFormate, byte[] documentFile) {
		super();
		this.documentId = documentId;
		this.documentType = documentType;
		this.documentFormate = documentFormate;
		this.documentFile = documentFile;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentFormate() {
		return documentFormate;
	}

	public void setDocumentFormate(String documentFormate) {
		this.documentFormate = documentFormate;
	}

	public byte[] getDocumentFile() {
		return documentFile;
	}

	public void setDocumentFile(byte[] documentFile) {
		this.documentFile = documentFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(documentFile);
		result = prime * result + Objects.hash(documentFormate, documentId, documentType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentDetails other = (DocumentDetails) obj;
		return Arrays.equals(documentFile, other.documentFile) && Objects.equals(documentFormate, other.documentFormate)
				&& documentId == other.documentId && Objects.equals(documentType, other.documentType);
	}

	@Override
	public String toString() {
		return "DocumentDetails [documentId=" + documentId + ", documentType=" + documentType + ", documentFormate="
				+ documentFormate + ", documentFile=" + Arrays.toString(documentFile) + "]";
	}
	
	
}
