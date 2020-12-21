package lotto.domain;

import java.util.List;

public class LottoNumber {
	private List<Integer> lottoNumber;

	public List<Integer> getLottoNumber() {
		return lottoNumber;
	}

	public void generate(NumberGenerator lottoNumberGenerator) {
		this.lottoNumber = lottoNumberGenerator.generateNumbers();
	}
}
