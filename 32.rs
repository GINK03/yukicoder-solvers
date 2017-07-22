use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin = io::stdin();

  let mut money:i32 = 0;
  for i in [100, 25, 1].iter() { 
    let line = stdin.lock().lines().next().unwrap().unwrap();
    money += i*line.parse::<i32>().unwrap();
  }
  let m1000 = money/1000;
  money     = money%1000;
  let m100  = money/100;
  money     = money%100;
  let m25   = money/25;
  money     = money%25;
  let m1    = money/1;
  println!("{}", m100+m25+m1);
}