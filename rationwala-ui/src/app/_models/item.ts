export class Item{
    private itemId:number;
	private itemName:string;
	private itemBrand:string;
	private itemCategory:string;
	private packageType:string;
	private itemType:string;

    public deserialize(o: Object): Item{
        if(!o)return;
        Object.assign(this, o);
        return this;
    }

    /**
     * Getter $itemId
     * @return {number}
     */
	public get $itemId(): number {
		return this.itemId;
	}

    /**
     * Getter $itemName
     * @return {string}
     */
	public get $itemName(): string {
		return this.itemName;
	}

    /**
     * Getter $itemBrand
     * @return {string}
     */
	public get $itemBrand(): string {
		return this.itemBrand;
	}

    /**
     * Getter $itemCategory
     * @return {string}
     */
	public get $itemCategory(): string {
		return this.itemCategory;
	}

    /**
     * Getter $packageType
     * @return {string}
     */
	public get $packageType(): string {
		return this.packageType;
	}

    /**
     * Getter $itemType
     * @return {string}
     */
	public get $itemType(): string {
		return this.itemType;
	}

    /**
     * Setter $itemId
     * @param {number} value
     */
	public set $itemId(value: number) {
		this.itemId = value;
	}

    /**
     * Setter $itemName
     * @param {string} value
     */
	public set $itemName(value: string) {
		this.itemName = value;
	}

    /**
     * Setter $itemBrand
     * @param {string} value
     */
	public set $itemBrand(value: string) {
		this.itemBrand = value;
	}

    /**
     * Setter $itemCategory
     * @param {string} value
     */
	public set $itemCategory(value: string) {
		this.itemCategory = value;
	}

    /**
     * Setter $packageType
     * @param {string} value
     */
	public set $packageType(value: string) {
		this.packageType = value;
	}

    /**
     * Setter $itemType
     * @param {string} value
     */
	public set $itemType(value: string) {
		this.itemType = value;
	}

}