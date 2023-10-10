package cc.plugg.util;

import java.io.File;
import java.lang.reflect.Field;

import co.binarylife.configapi.config.Config;

public class PluggConfig extends Config {

	public PluggConfig() {
		super(new File(FileUtil.getFolder(), "bot-config.yml"));
	}
	
	
	public void load() {
		for(Field f : StringUtil.class.getDeclaredFields()) {
			if(f.isAccessible()) {
				if(this.contains(f.getName().toLowerCase().replaceAll("_", "-")))
					try {
						f.set(null, getString(f.getName().toLowerCase().replaceAll("_", "-")));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				else {
					try {
						this.set(f.getName().toLowerCase().replaceAll("_", "-"), f.get(null).toString());
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
