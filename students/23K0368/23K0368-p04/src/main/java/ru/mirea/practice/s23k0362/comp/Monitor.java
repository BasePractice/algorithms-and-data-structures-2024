package ru.mirea.practice.s23k0362.comp;

public  class Monitor {
    public String nameMonitor;
    public String aspectRatiomonitore; // соотношение сторон
    public String sizeMonitore;
    public String permissionMonitore; // разрешение монитора
    public Integer colorDepthmonitore; // глубина цвета
    public Integer hzmonitore;
    public Double timeMonitore; //время отклика

    public Monitor(String nameMonitor, String aspectRatiomonitore, String sizeMonitore, String permissionMonitore,
                   Integer colorDepthmonitore, Integer hzmonitore, Double timeMonitore) {
        this.nameMonitor = nameMonitor;
        this.aspectRatiomonitore = aspectRatiomonitore;
        this.sizeMonitore = sizeMonitore;
        this.permissionMonitore = permissionMonitore;
        this.colorDepthmonitore = colorDepthmonitore;
        this.hzmonitore = hzmonitore;
        this.timeMonitore = timeMonitore;
    }

    public String getnameMonitor() {
        return nameMonitor;
    }

    public void setnameMonitor(String nameMonitor) {
        this.nameMonitor = nameMonitor;
    }

    public String getaspectRatiomonitore() {
        return aspectRatiomonitore;
    }

    public void setaspectRatiomonitore(String aspectRatiomonitore) {
        this.aspectRatiomonitore = aspectRatiomonitore;
    }

    public String getsizeMonitore() {
        return sizeMonitore;
    }

    public void setsizeMonitore(String sizeMonitore) {
        this.sizeMonitore = sizeMonitore;
    }

    public String getpermissionMonitore() {
        return permissionMonitore;
    }

    public void setpermissionMonitore(String permissionMonitore) {
        this.permissionMonitore = permissionMonitore;
    }

    public Integer getcolorDepthmonitore() {
        return colorDepthmonitore;
    }

    public void setcolorDepthmonitore(Integer colorDepthmonitore) {
        this.colorDepthmonitore = colorDepthmonitore;
    }

    public Integer gethzmonitore() {
        return hzmonitore;
    }

    public void sethzmonitore(Integer hzmonitore) {
        this.hzmonitore = hzmonitore;
    }

    public Double gettimeMonitore() {
        return timeMonitore;
    }

    public void settimeMonitore(Double timeMonitore) {
        this.timeMonitore = timeMonitore;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "aspectRatiomonitore='" + aspectRatiomonitore + '\''
                + ", sizeMonitore=" + sizeMonitore
                + ", permissionMonitore=" + permissionMonitore
                + ", colorDepthmonitore=" + colorDepthmonitore
                + ", hzmonitore=" + hzmonitore
                + ", timeMonitore=" + timeMonitore
                + '}';
    }
}
