package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕师 == 根据builder定义的制作工序制作蛋糕</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:53 2018-11-9
 * @Version V.1.0.1
 */
public class CakeMaker implements  CakeBuilder{


    /**
     * 蛋糕师傅的姓名
     */
    private String name ;

    /**
     * 蛋糕师要制作的蛋糕，蛋糕师不关心蛋糕最后去了哪，他只需要把做好的蛋糕放在货架上即可
     */
    private Cake cake = new Cake();

    public  CakeMaker(){

    }

    public  CakeMaker(String name){
        this.name = name;
    }
    
    
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param cake the cake to set
	 */
	public void setCake(Cake cake) {
		this.cake = cake;
	}

	@Override
    public void knead() {
       cake.addProcess("揉面 -- 软软的，滑滑的");
    }

    @Override
    public void ferment() {
        cake.addProcess("发酵 -- 酵一酵");
    }

    @Override
    public void bake(int minutes) {
        cake.addProcess("烘烤 -- "+minutes+"分钟");
    }

    @Override
    public Cake getCake() {
        return this.cake;
    }
}
