import React from "react";
import {Navbar, Nav} from 'react-bootstrap';
import {Link} from "react-router-dom";

class NavigationBar extends React.Component{

    render(){
        return ( <Navbar bg="dark" variant="dark">
                <Link to={"welcome"} className="navbar-brand">
                    SappianoS
                </Link>
                <Nav className="mr-auto">
                    <Link to={"list"} className="nav-link">Search</Link>
                    <Link to={"add"} className="nav-link">Share a meal</Link>
                    <Link to={"inbox"} className="nav-link">Inbox</Link>
                    <Link to={"profile"} className="nav-link">Profile</Link>
                </Nav>
        </Navbar>
        );
    }

}

export default   NavigationBar;