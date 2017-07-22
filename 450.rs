use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin  = io::stdin();
  let line   = stdin.lock().lines().next().unwrap().unwrap();
  let v      = line.split(" ").collect::<Vec<&str>>();
  let vv     = v.iter().map( |x| x.to_string()).map(|x| x.parse::<f64>().unwrap() ).collect::<Vec<f64>>();
  let v1     = vv[0];
  let v2     = vv[1];
  let d = stdin.lock().lines().next().unwrap().unwrap().parse::<f64>().unwrap();
  let w = stdin.lock().lines().next().unwrap().unwrap().parse::<f64>().unwrap();
  println!("{}", w*(d/(v2+v1)));
}