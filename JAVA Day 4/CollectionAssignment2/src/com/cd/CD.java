package com.cd;

public class CD {
	private String Title;
	private String Singer;

	public CD() {

	}

	public CD(String Title, String Singer) {
		super();
		this.Title = Title;
		this.Singer = Singer;

	}

	

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}



	@Override
	public String toString() {
		return "CD [Title=" + Title + ", Singer=" + Singer+" ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((Singer == null) ? 0 : Singer.hashCode());
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
		CD other = (CD) obj;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		
		if (Singer == null) {
			if (other.Singer != null)
				return false;
		} else if (!Singer.equals(other.Singer))
			return false;
		return true;
	}
}
