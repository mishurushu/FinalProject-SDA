import React from "react";
import {Navbar, Nav} from 'react-bootstrap';

class NavigationBar extends React.Component{

    render(){
        return ( <Navbar bg="dark" variant="dark">
                <Navbar.Brand href="/">SappianoS</Navbar.Brand>
                <Nav className="mr-auto">
                    <Nav.Link href="/product">Search</Nav.Link>
                    <Nav.Link href="#share">Share a meal</Nav.Link>
                    <Nav.Link href="#login">Inbox</Nav.Link>
                    <Nav.Link href="#login">Profil</Nav.Link>
                </Nav>
        </Navbar>
        );
    }

}

export default   NavigationBar;