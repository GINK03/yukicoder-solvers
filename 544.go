package main

import (
	"bufio"
	"fmt"
	"math/rand"
	"os"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func read() string {
	sc.Scan()
	var input = sc.Text()
	return input
}

func main() {
	text := read()
	le := len(text)
	b := 1
	for i := 0; i < le; i++ {
		b *= 10
	}
	st := 1
	en := 0
	orig, _ := strconv.Atoi(text)
	for true {
		en = rand.Intn(orig)
		st = orig - en
		enstr := []rune(strconv.Itoa(en))
		ststr := []rune(strconv.Itoa(st))
		runes := make(map[rune]int, 0)
		for _, r := range enstr {
			runes[r] = 1
		}
		for _, r := range ststr {
			runes[r] = 1
		}
		_, ok := runes['7']
		if ok == false {
			fmt.Printf("%d %d\n", st, en)
			break
		}
	}
}
