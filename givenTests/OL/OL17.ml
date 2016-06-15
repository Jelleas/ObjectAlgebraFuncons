type 'a testref = { mutable contents: 'a };;
(* type testref defined. *)

let prefix ! r = r.contents;;
(* ! : 'a testref -> 'a = <fun> *)

let prefix := r newval = r.contents <- newval;;
(* := : 'a testref -> 'a -> unit = <fun> *)

let mkRef a = { contents = a };;
(* mkRef : 'a -> 'a testref = <fun> *)

let current_rand = mkRef 0;;
(* current_rand : int testref = {contents = 0} *)

let random () =
  current_rand := !current_rand * 25713 + 1345;
  !current_rand;;
(* random : unit -> int = <fun> *)

random ();;
(* - : int = 1345 *)
random ();;
(* - : int = 34585330 *)
random ();;
(* - : int = 889292591635 *)
random ();;
(* - : int = 22866380408712100 *)
random ();;
(* - : int = -2332570909491423067 *)

