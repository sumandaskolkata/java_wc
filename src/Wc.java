class Wc  {
	
	private String data;
	

	Wc(String data) {
		this.data=data;
	}

	public int charCount(){
		String regx = "";
		String[] splitString = this.data.split(regx);
		return splitString.length;
	}

	public int wordCount(){
		String regx = " ";
		String[] splitString = this.data.split(regx);
		return splitString.length;
	}
	public int lineCount(){
		String regx = "\n";
		String[] splitString = this.data.split(regx);
		return splitString.length;
	}
}