import { StatusInfo } from "./status-info";

export class ChangeOrderStatusResponse{
    private statusInfo:StatusInfo;
    
    public deserialize(o: Object): ChangeOrderStatusResponse {
        if (!o) return;
        Object.assign(this, o);
        this.$statusInfo = new StatusInfo().deserialize(this.$statusInfo);
        return this;
    }

    /**
     * Getter $statusInfo
     * @return {StatusInfo}
     */
	public get $statusInfo(): StatusInfo {
		return this.statusInfo;
	}

    /**
     * Setter $statusInfo
     * @param {StatusInfo} value
     */
	public set $statusInfo(value: StatusInfo) {
		this.statusInfo = value;
	}

}