class Result {
    public static final String position = null;
    private String name;
    private int finishTime;
    
    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int racerTime) {
        this.finishTime = racerTime;
    }

	public int getWordsTyped() {
		return 0;
	}

	public String getBotName() {
		return name;
	}

    public int getWpm() {
        return 0;
    }
}