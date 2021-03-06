let temporarily_set_reference r = function newval -> function funct ->
  let oldval = !r in
  try
    (r := newval;
    let res = funct () in
    r := oldval;
    res)
  with x ->
    (r := oldval;
    raise x);;
(* temporarily_set_reference : 'a ref -> 'a -> (unit -> 'b) -> 'b = <fun> *)

let x = ref 0;;
(* x : int ref = ref 0 *)

let y = function u -> x := ! x + 1; !x;;
(* y : 'a -> int = <fun> *)

!x;;
(* - : int = 0 *)

temporarily_set_reference x 2 y;;
(* - : int = 3 *)

!x;;
(* - : int = 0 *)

