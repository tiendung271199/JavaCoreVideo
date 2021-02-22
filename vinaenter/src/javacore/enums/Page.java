package javacore.enums;

public enum Page {
	// định nghĩa nhiều giá trị cho hằng số enum
	PAGE_01("PAGE_01", "Login", "/login"),
	PAGE_02("PAGE_02", "Add New User", "/addUser"),
	PAGE_03("PAGE_03", "Admin", "/admin");

	private String pageId;
	private String pageTitle;
	private String pageURL;

	private Page(String pageId, String pageTitle, String pageURL) {
		this.pageId = pageId;
		this.pageTitle = pageTitle;
		this.pageURL = pageURL;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}
}
