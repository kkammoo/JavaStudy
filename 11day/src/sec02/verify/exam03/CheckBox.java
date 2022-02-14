package sec02.verify.exam03;

import sec02.verify.exam03.CheckBox.OnSelectListener;

public class CheckBox {

	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener {
		void onSelect();
	}
	
}
